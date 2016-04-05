grammar Grammar;

prog : dcls EOF;

setupblock : 'Setup' block;

repeatblock : 'Repeat' block;

dcls : (actdcl | funcdcl | vardcl';' | setupblock | repeatblock | 'Tankname' ID ';' | eventdcl | print';')* ;

actdcl : 'Action' ID '(' params? ')'block;

funcdcl : 'Function' ID '(' params? ')' 'returns' TYPE block;

params : param (',' param)*;

param : TYPE ID;

eventdcl : 'When' ID block;

block : '{' stmts '}';

stmts : (assign';'|vardcl';'|ifstmt|whilestmt|returnstmt';'|call';'|print';')*;

assign : ID '=' expr;

vardcl : TYPE (ID|assign);

ifstmt : 'if''('expr')' block elseif* ('else' block)?;

elseif : 'else''if''('expr')' block;

whilestmt : 'repeat' ('while''('expr')' block | block 'while''('expr')');

returnstmt : 'return' expr?;

print : 'print('expr')';

call : acall | fcall | rcall | ecall;

acall : 'run' ID'('args?')';

fcall : ID'('args?')';

rcall : 'Tank.'ID'('args?')' | 'Gun.'ID'('args?')'
        | 'Radar.'ID'('args?')' | 'Battlefield.'ID'('args?')'
        | 'Math.'ID'('args?')';

ecall : 'Event.'ID'('args?')';

args : expr (',' expr)*;

expr : orexpr ;

orexpr : andexpr (OR andexpr)*;

andexpr : eqexpr (AND eqexpr)*;

eqexpr : relexpr (EQ relexpr)*;

relexpr : addexpr (REL addexpr)*;

addexpr : mulexpr (ADD mulexpr)*;

mulexpr : unexpr (MUL unexpr)*;

unexpr : 'NOT'? atomic;

atomic : '(' expr ')' | call | literal ;

literal : ID    #id
        | NUM   #num
        | STRING #string
        | BOOL  #bool ;

ID : [_a-z] [_a-zA-Z]* ;
OR : 'OR';
AND : 'AND';
EQ : 'IS='|'NOT=';
REL : '>'|'<'|'>='|'<=';
ADD : '+'|'-';
MUL : '*'|'/'|'%';
NUM : '-'?[0-9]+('.'[0-9]+)?;
BOOL : 'False' | 'True';
STRING : '"'~'"'*'"';
TYPE : 'Num'|'Bool'|'String';


COMMENT : '/*'~['*/']*'*/' -> skip;
SPACE : [ \r\t\n] -> skip;