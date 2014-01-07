grammar gic_fa1_c;

biblioteca : registos ;

registos    : registo
            | registo ',' registos
			;

registo     : '[' REGISTO descricao EXISTENCIAS existencias ']' ;


descricao   : referencia ':' catalogo '-' tipo '-' titulo '(' autores ')' editora '-' ano ;

referencia  : ID ;

tipo        : LIVRO
            | CDROM
            | OUTRO
            ;

titulo      : STRING ;

autores     : autor
            | autores ',' autor ;

autor       : STRING ;

editora     : STRING ;

ano         : NUM ;

catalogo    : BGUM
            | BAUM
            | OUTRO
            ;

existencias : estado
            | existencias ',' estado
            ;

estado      : codigobarras disponib ;

codigobarras: ID ;

disponib    : ESTANTE
            | PERMANENTE
            | EMPRESTADO datadev
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
