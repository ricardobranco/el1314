grammar eg13Ex2_gtab_Gr01;

familias : familia+
         ;

familia : 'FAMILIA' CODIGO ':' elementos '.'
        ;

elementos : progenitores (casamento)? (filhos)?
          ;

progenitores : pai mae
             | mae pai
             ;

pai : 'PAI' identificacao
    ;

mae : 'MAE' identificacao
    ;

identificacao : nome datas
              ;

datas : DATA DATA?
     ;

nome : NOME NOME
     ;

casamento: 'CASAMENTO' (LUGAR)? DATA
         ;
           
filhos : filho (',' filho)*
       ;

filho : 'FILHO' NOME SEXO datas
      ;

NOME : '"'([A-Za-z]+)(' '[A-Za-z]+)*'"' ;

SEP : ((' '|'\t'|'\r'?'\n')+|',') -> skip ;
      
SEXO : ('M'|'F') ;

NR : ('0'..'9') ;

DATA : NR NR NR NR '-' NR NR? '-' NR NR? ;

LUGAR : '"'[A-Z][a-z]*((' '|'-'|'/'|)[A-Za-z])*'"' ;

CODIGO : [a-zA-Z0-9]+ ;

/* 
Data Morte > Data Nascimento (ERRO)
Data Válida (ERRO)
Data Casamento > Data Nascimento Progenitores (AVISO)
Data Nascimento Filhos > Data Nascimento Pais (ERRO)
Data Nascimento Filhos < Data Morte - 9 Meses (ERRO)
Filhos com datas de nascimento iguais ou diferença de 9 meses (ERRO)
Casamento com pessoa com menos de 18 anos (ERRO)
*/