grammar eg13Ex2_gt12_Gr01;

@header{
        import java.util.GregorianCalendar;
        import java.util.TreeSet;
        import java.util.Iterator;
      }

@members{
          int nrFamilias=0, totalfilhos=0;int id=1;
        }

familias 
        
        @init{
          System.out.println("CREATE TABLE pessoas (chave INT, nomeproprio VARCHAR(30), apelido VARCHAR(30), genero VARCHAR(12));");

        } 
        @after{
          System.out.println("Nº de Familias: "+nrFamilias);
          System.out.println("Nº de Filhos: "+totalfilhos);
          System.out.println("Média de Filhos:"+(totalfilhos/nrFamilias));
          
         }
         : familia+
         ;

familia 
        
        @after{nrFamilias++;}
        : 'FAMILIA' CODIGO ':' e = elementos '.'
        {System.out.println("A familia com o ID: "+$CODIGO.text+" tem "+ $e.nrFilhos+" filho(s)");}
        ;

elementos returns[int nrFilhos]
          @init{$nrFilhos=0;} 
          : p = progenitores (c = casamento)? (f=filhos)?
          {
            
            if($c.text!=null){
            /*Testar as datas do pai*/
            
            if($c.data_casamento.before($p.dn_pai)){
                System.err.println("Data do casamento ocorre antes da data de nascimento do pai");
            }

            if($p.text != null){
               if($c.data_casamento.after($p.dm_pai)){
                System.err.println("Data do casamento ocorre depois da data de hóbito do pai");
            } 
            }
            /*Testar as datas da mae*/
            if($c.data_casamento.before($p.dn_mae)){
                System.err.println("Data do casamento ocorre antes da data de nascimento da mae");
            }
            if($p.dm_mae != null){
               if($c.data_casamento.after($p.dm_mae)){
                System.err.println("Data do casamento ocorre depois da data de hóbito do mae");
            } 
            }

            /* Testar se o casamento ocorreu 18 anos após o nascimento dos progenitores*/
            GregorianCalendar auxpai = $p.dn_pai;
            auxpai.add(GregorianCalendar.YEAR,auxpai.get(GregorianCalendar.YEAR)+18);
            GregorianCalendar auxmae = $p.dn_pai;
            auxmae.add(GregorianCalendar.YEAR,auxmae.get(GregorianCalendar.YEAR)+18);
            if($c.data_casamento.before(auxpai) ||$c.data_casamento.before(auxmae) ){
                System.err.println("O Casamento ocorreu antes dos progenitores terem ambos 18 anos");
            }
        }

        /*Testar data de nascimentos dos filhos*/
        if($f.nascimentos!=null && $f.nascimentos.size() > 0){
            $nrFilhos += $f.nascimentos.size();
            /* Compara a dn do filho com o casamento*/
            if($c.data_casamento!=null){
                if($c.data_casamento.after($f.nascimentos.last())){
                    System.err.println("Aviso: Um filho nasceu antes do casamento");
                }
            }
            /* Compara a dn do filho mais novo com a dos pais*/
            if($f.nascimentos.last().before($p.dn_pai)){
                System.err.println("Um filho nasceu antes do pai");
            }
            if($f.nascimentos.last().before($p.dn_mae)){
                System.err.println("Um filho nasceu antes da mae");
            }

            /* Testar se os filhos nasceram com diferença de 9 meses*/
            Iterator<GregorianCalendar> nascimentos_it = $f.nascimentos.iterator();
            GregorianCalendar gc = nascimentos_it.next();

            while(nascimentos_it.hasNext()){
                GregorianCalendar aux = gc;
                aux.add(GregorianCalendar.MONTH,aux.get(GregorianCalendar.MONTH)+9);
                gc = nascimentos_it.next();

                if(gc.before(aux)){
                  System.err.println("Um filho nasceu 9 meses antes do nascimento anterior");  
                }
            }


        }




          }
          ;

progenitores    returns[GregorianCalendar dn_pai , GregorianCalendar dn_mae, GregorianCalendar dm_pai, GregorianCalendar dm_mae] 
                : p = pai m = mae
                { $dn_pai = $p.dn;
                  $dn_mae = $m.dn;
                  $dm_pai = $p.dm;
                  $dm_mae = $m.dm;
                }
                | m = mae p = pai  
                { $dn_pai = $p.dn;
                  $dn_mae = $m.dn;
                  $dm_pai = $p.dm;
                  $dm_mae = $m.dm;
                }

                ;

pai returns[GregorianCalendar dn, GregorianCalendar dm]
    : 'PAI' id=identificacao
    {
        $dn = $id.dn;
        $dm = $id.dm;
        

    }
    ;

mae returns[GregorianCalendar dn, GregorianCalendar dm]
    : 'MAE' id=identificacao
    {
        $dn = $id.dn;
        $dm = $id.dm;
    }
    ;
identificacao returns[GregorianCalendar dn, GregorianCalendar dm] 
              : nome val_datas = datas
              {$dn = $val_datas.gc_nascimento;
               $dm = $val_datas.gc_morte;
               
              }
              ;

datas returns[GregorianCalendar gc_nascimento, GregorianCalendar gc_morte] 
        :  data1 = data data2 = data?
        {
            $gc_nascimento = $data1.gc;
            if($data2.text!=null){
            $gc_morte = $data2.gc;
                if($data2.gc.before($data1.gc)){
                    System.err.println("Data da Morte acontece antes da Data de Nascimento");
                }
            }
            

        }
        ;

nome : NOME NOME
     ;

casamento   returns[GregorianCalendar data_casamento]
            : 'CASAMENTO' (LUGAR)? val_data = data
            {$data_casamento = $val_data.gc;
            }
            ;
           
filhos  returns[TreeSet<GregorianCalendar> nascimentos]       
        @init{$nascimentos = new TreeSet<GregorianCalendar>();}
        : f1 = filho {$nascimentos.add($f1.dn);}
        (',' f2 = filho {$nascimentos.add($f2.dn);} )*
        ;

filho   returns[GregorianCalendar dn]
        @after{totalfilhos++;}
        : 'FILHO' NOME SEXO val_datas = datas
        {
            $dn = $val_datas.gc_nascimento;
            
        }
        ;
data    returns[GregorianCalendar gc]
        :d=DATA 
        {
         GregorianCalendar hoje = new GregorianCalendar();
         Date date = null;
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
         
         $gc = hoje;
         try{
             date = sdf.parse($d.text);
         $gc.setTime(date);
        
         if(!sdf.format(date).equals($d.text)){
              System.err.println("ERRO: A data introduzida não é valida");
         }
         
         if(hoje.before($gc)){
            System.err.println("ERRO: A data introduzida ainda não ocorreu");
         } 
             
             }
         catch(ParseException e){}
              
        }
        ;




NOME : '"'([A-Za-z]+)(' '[A-Za-z]+)*'"' ;

SEP : ((' '|'\t'|'\r'?'\n')+|',') -> skip ;
      
SEXO : ('M'|'F') ;

ANO : NR NR NR NR;

MESDIA :NR NR?;

NR : [0-9] ;

LUGAR : '"'[A-Z][a-z]*((' '|'-'|'/'|)[A-Za-z])*'"' ;

CODIGO : [a-zA-Z0-9]+ ;
