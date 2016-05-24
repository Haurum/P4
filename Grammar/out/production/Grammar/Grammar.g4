grammar Grammar;

prog : dcls EOF;

tankname : 'Tankname' ID SEMI;

setupblock : 'Setup' block;

repeatblock : 'Repeat' block;

dcls : (actdcl
     | funcdcl
     | vardcl
     | setupblock
     | repeatblock
     | tankname
     | eventdcl
     | print)*
     ;

actdcl : 'Action' ID '(' params? ')'block;

funcdcl : 'Function' ID '(' params? ')' 'returns' TYPE functionBlock;

functionBlock : '{' stmts returnstmt SEMI '}';

params : param (',' param)*;

param : TYPE ID;

eventdcl : 'When' ID block;

block : '{' stmts '}';

stmts : (assign
      |vardcl
      |ifstmt
      |whilestmt
      |stmtcall
      |print)*
      ;

assign : ID '=' expr SEMI;

vardcl : TYPE (ID SEMI|assign);

ifstmt : 'if''('expr')' block elseif* ('else' block)?;

elseif : 'else''if''('expr')' block;

whilestmt : 'repeat' 'while''('expr')' block
          ;

returnstmt : 'return' expr;

print : 'print('expr')' SEMI;

stmtcall : call SEMI;

call : acall
     | fcall
     | rcall
     | ecall
     ;

acall : 'run' ID'('args?')';

fcall : ID'('args?')';

rcall   : 'Tank.'ID'('args?')'          #tankcall
        | 'Gun.'ID'('args?')'           #guncall
        | 'Radar.'ID'('args?')'         #radarcall
        | 'Battlefield.'ID'('args?')'   #battlefieldcall
        | 'Utils.'ID'('args?')'          #utilscall
        ;

ecall : 'Event.'ID'('args?')';

args : expr (',' expr)*;

expr    : MINUS expr                            #minusexpr
        | NOT expr                              #notexpr
        | expr op=(MULT | DIV | MOD) expr       #mulexpr
        | expr op=(PLUS | MINUS) expr           #addexpr
        | expr op=(LTEQ | GTEQ | LT | GT) expr  #relexpr
        | expr op=(EQ | NEQ) expr               #eqexpr
        | expr AND expr                         #andexpr
        | expr OR expr                          #orexpr
        | atomic                                #atomicexpr
        ;

atomic : '(' expr ')'
     | call
     | literal
     ;

literal : ID        #id
        | NUM       #num
        | STRING    #string
        | BOOL      #bool
        ;

SEMI : ';';
OR : 'OR';
AND : 'AND';
EQ : 'IS=';
NEQ : 'NOT=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
NOT : '!';

ID  : [_a-z] [_a-zA-Z]* ;

NUM :  [0-9]+('.'[0-9]+)?;
BOOL : 'False' | 'True';
STRING : '"'~'"'*'"';
TYPE : 'Num'|'Bool'|'String';

COMMENT : '/*'~['*/']*'*/' -> skip;
SPACE : [ \r\t\n] -> skip;
