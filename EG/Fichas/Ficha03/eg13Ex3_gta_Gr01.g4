grammar eg13Ex3_gta_Gr01;

@members{
	int total,totalLinha,unidade,quantidade;
}

faturas	: fatura+;

fatura : 'FATURAS' cabec 'VENDAS' corpo ;

cabec : idfat idforn 'CLIENTE' idclie ;

idfat : numfat ;

numfat : ID ;

idforn : nome morada 'NIF:' nif 'NIB:' nib ;

idclie : nome morada 'NIF:' nif ;

nome : STR ;

nif : INT ;

nib : INT ;
morada : STR ;

corpo
	@init{total=0;}
	@after{
		System.out.println("Total: "+total);		
	}	 
	: (linha '.')+ ;

linha 
	@init{totalLinha=0;}
	@after{
		totalLinha=unidade*quantidade;
		total+=totalLinha;
		System.out.println("Total Linha: "+totalLinha);
	}
	: refprod '|' u = valunit '|' q = quant  	
	;

refprod : ID ;

valunit : INT {unidade=$INT.int;};

quant : INT {quantidade=$INT.int;};  


INT : [0-9]+;

STR: [a-zA-Z]+;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;
