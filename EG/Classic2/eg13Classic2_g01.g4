grammar eg13Classic2_g01;

sequencias : (sequencia)+
           ;

sequencia : NUMERO '[' palavra ']'
            {   
             if($palavra.nr_caracteres == $NUMERO.int){
                System.out.println("A sequência " + $sequencia.text + " é uma sequência válida pois representa correctamente o número de caracteres da palavra " + $palavra.text + ". \n");   
             }else{
                System.out.println("A sequência " + $sequencia.text + " é uma sequência inválida, a palavra tem " + $palavra.nr_caracteres + " caracteres e a sequência indica que devia ter " + $NUMERO.int + " caracteres. \n"); 
             }
            }
          ;

palavra returns [int nr_caracteres]: (CARACTER {$nr_caracteres++;})*
        ;

CARACTER: [a-zA-Z-] ;
NUMERO: '0'..'9'+ ;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;