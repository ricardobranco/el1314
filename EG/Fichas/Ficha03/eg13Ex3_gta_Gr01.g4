grammar eg13Ex3_gta_Gr01;

faturas	: fatura
	| faturas fatura
	;

fatura : 'FATURAS' cabec 'VENDAS' corpo ;

cabec : idfat idforn 'CLIENTE' idclie ;

idfat : numfat ;

numfat : ID ;

idforn : nome morada 'NIF:' nif 'NIB:' nib ;

idclie : nome morada 'NIF:' nif ;

nome : STR ;

nif : STR ;

nib : STR ;
morada : STR ;

corpo : linha '.'
      | corpo linha '.'
      ;

linha : refprod '|' valunit '|' quant ;

refprod : ID ;

valunit : INT ;

quant : INT ;  

STR: [a-zA-Z]+;

INT : [0-9]+;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;
