grammar eg13Ex3_gtbc_Gr01;

@header{
	import java.util.HashMap;
}
@members{
	HashMap<String,Integer> produtos_quantidade,produtos_valor;
	int total,totalLinha,valor,quantidade;
	String s_refprod;
}

loja : stock faturas ;

stock 
	@init{
		produtos_quantidade = new HashMap<String,Integer>();
		produtos_valor = new HashMap<String,Integer>();
	}
	: 'STOCK' produtos
	;

produtos : produto+;

produto 
	@after{
		produtos_quantidade.put(s_refprod,quantidade);
		produtos_valor.put(s_refprod,valor);
	}
	: refprod '|' desc '|' valunit '|' quant '.'
	;

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
		Integer int_quantidade =  produtos_quantidade.get(s_refprod);
		if(int_quantidade==null || int_quantidade==0){
			System.err.println("ERRO: Não existe o produto com a referência "+s_refprod+" em stock");
		}else if(int_quantidade-quantidade < 0){
			System.err.println("ERRO: A quantidade pretendida("+quantidade+") é superior a quantidade existente em stock("+int_quantidade+")");

		}
		else{
			Integer int_valor = produtos_valor.get(s_refprod);
			totalLinha = int_valor*int_quantidade;
			total+=totalLinha;
			System.out.println("Total Linha: "+totalLinha);
			int_quantidade-=quantidade;
			produtos_quantidade.put(s_refprod,int_quantidade);
			if(int_quantidade==0){
				System.err.println("AVISO: Não existem mais unidades do produto com a referência "+s_refprod+" em stock");
			}else{
				System.out.println("Restaram "+int_quantidade+" unidades do produto com a referência "+s_refprod+" em stock");
			}
		}
		
	}
	: refprod '|' quant  	
	;

refprod : ID {s_refprod = $ID.text;};

valunit 
	@after{
		if(valor==0){
			System.err.println("AVISO: O valor unitario é igual a 0(ZERO)");
		}
	}
	: INT {valor=$INT.int;};

quant 
	@after{
		if(quantidade==0){
			System.err.println("ERRO: A quantidade não pode ser igual a 0(zero)");
		}
	}
	: INT {quantidade=$INT.int;};  

desc : STR ;

INT : [0-9]+;

STR: [a-zA-Z]+;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;

Sep: ('\r'? '\n' | ' ' | '\t')+  -> skip;
