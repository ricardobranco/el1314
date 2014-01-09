grammar ga_fa1_g;

@header{
        import java.util.*;
}

@members{
      class Registo {
            String ref;
            int nrLivros;

            public Registo(){
                  nrLivros = 0;
            }
      }

      class Registos {
            HashMap<String,Registo> registos ;
            TreeSet<String> livros;
            int permanentes;

            public Registos(){
                  registos = new HashMap<String,Registo>();
                  livros = new TreeSet<String>();
                  permanentes = 0;
            }
      }
}

biblioteca  : r=registos
            {System.out.println("Nº de Registos: "+$r.out_registos.registos.size());
             System.out.println("Nº de Livros com o estado permanente: "+$r.out_registos.permanentes);
             System.out.println("Lista de livros:");
             for(String s : $r.out_registos.livros){
                  System.out.println("\t"+s);
             }
            }
            ;

registos    returns [Registos out_registos]
            : r = registo
            { $out_registos = new Registos();
              $out_registos.registos.put($r.out_registo.ref,$r.out_registo);
              if($r.out_isLivro){
                  $out_registos.livros.add($r.out_titulo);
                  $out_registos.permanentes = $r.out_NPermanente;
              }
              System.out.println("Foram inseridos "+$r.out_registo.nrLivros+" livros");
            }
            | r1 = registos ',' r2 =
              registo
            { $out_registos = $r1.out_registos;
              Registo registo_antigo = $out_registos.registos.put($r2.out_registo.ref,$r2.out_registo);
              if(registo_antigo != null){
                  System.err.println("ERRO: Já existe um registo com a referencia "+registo_antigo.ref);
              }else{
                  if($r2.out_isLivro){
                        $out_registos.livros.add($r.out_titulo);
                        $out_registos.permanentes = $r2.out_NPermanente;
                  }
                  System.out.println("Foram inseridos "+$r2.out_registo.nrLivros+" livros");
              }
            }
            ;

registo     returns [Registo out_registo, boolean out_isLivro, String out_titulo, int out_NPermanente]
@init       {$out_registo = new Registo();}
            : '[' REGISTO d = descricao EXISTENCIAS e = existencias ']'
            {     $out_registo.ref = $d.out_referencia;
                  if($d.out_isLivro){
                        $out_registo.nrLivros = $e.out_quantidade;
                  }
                  $out_NPermanente = $e.out_NPermanente;
                  $out_isLivro = $d.out_isLivro;
                  $out_titulo = $d.out_titulo;
            }
            ;

descricao   returns [String out_referencia, boolean out_isLivro,String out_titulo]
            : r = referencia {$out_referencia = $r.text;}':' catalogo '-' t1 = tipo {$out_isLivro = $t1.out_isLivro;} '-' t2 = titulo {$out_titulo = $t2.text;} '(' autor ')' editora '-' ano ;

referencia  : ID ;

tipo        returns [boolean out_isLivro]
            : LIVRO {$out_isLivro = true;}
            | CDROM {$out_isLivro = false;}
            | OUTRO {$out_isLivro = false;}
            ;

titulo      : STRING ;

autor       : STRING ;

editora     : STRING ;

ano         : NUM ;

catalogo    : BGUM
            | BAUM
            | OUTRO
            ;

existencias returns [int out_quantidade,int out_NPermanente]
            : e = estado {$out_quantidade=1;
                          $out_NPermanente=$e.out_NPermanente;
                         }
            | e1 = existencias
              ',' e2 = estado {$out_quantidade=$e1.out_quantidade + 1;
                               $out_NPermanente=$e1.out_NPermanente + $e2.out_NPermanente;
                              }
            ;


estado      returns [int out_NPermanente]
            : codigobarras d = disponib {$out_NPermanente = $d.out_NPermanente;}
            ;

codigobarras: ID ;

disponib    returns [int out_NPermanente]
            : ESTANTE {$out_NPermanente = 0;}
            | PERMANENTE {$out_NPermanente = 1;}
            | EMPRESTADO datadev {$out_NPermanente = 0;}
            ;
datadev     : ano '-' mes '-' dia ;

mes         : NUM ;

dia         : NUM ;

REGISTO     : 'REGISTO' ;

EXISTENCIAS : 'EXISTENCIAS' ;

LIVRO       : 'LIVRO' ;

CDROM       : 'CDROM' ;

OUTRO       : 'OUTRO' ;

BGUM        : 'BGUM' ;

BAUM        : 'BAUM' ;

ESTANTE     : 'ESTANTE' ;

PERMANENTE  : 'PERMANENTE' ;

EMPRESTADO  : 'EMPRESTADO' ;

ID          : [a-z][a-z0-9_]* ;

STRING      : '"' ( '\\"' | . )*? '"' ;

NUM         : [0-9]+ ;

Sep         :    ('\r'? '\n' | ' ' | '\t')+ -> skip;
