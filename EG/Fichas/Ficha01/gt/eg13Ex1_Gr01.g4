grammar eg13Ex1_Gr01;

@header {
           import java.util.ArrayList;
}

@members {
          int contador, contaN, soma, somatorio, resultado, maior, ultimo;
          boolean somar, subtrair, crescente;
          ArrayList<Integer> arr;
}

lista
@init  { contador=contaN=soma=somatorio=resultado=maior=ultimo = 0;
         somar = false;
         crescente = true;
         arr = new ArrayList<Integer>();
       }
@after { System.out.println("Tamanho da lista: " + contador); 
         System.out.println("Número de INTeiros: " + contaN);
         System.out.println("Soma da lista: " + somatorio);
         System.out.println("Soma após palavra 'soma': " + soma);
         System.out.println("Resultado após somas e subtrações: " + resultado);
         System.out.println("Números por ordem crescente: " + crescente);
         System.out.println("Lista de números menores que o anterior: " + arr);
       } 
     : 'LISTA' elems '.' 
     ;

elems 
     : elem       {  contador++; } 
       (',' elem  {  contador++; })*
     ;

elem 
    : NUMERO { contaN = contaN+1; 
               somatorio += $NUMERO.int;
               if(subtrair == true){
                    resultado -= $NUMERO.int;
               } else if (somar == true){
                    soma += $NUMERO.int;
                    resultado += $NUMERO.int;
               }
               if(crescente == true){
                    if($NUMERO.int >= maior){
                         maior = $NUMERO.int;
                    } else {
                         crescente = false;
                    }
               }
               if($NUMERO.int < ultimo){
                    arr.add(contador);
               }
               ultimo = $NUMERO.int;
             }
    | PAL    { if($PAL.text.equals("soma")) {
                    somar = true;
                    subtrair = false;
               } else if ($PAL.text.equals("subtrair")) {
                    subtrair = true;
               }
             }
    ;

PAL:    [a-zA-Z][-a-zA-Z_0-9]* ;

NUMERO: '0'..'9'+ ;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;
