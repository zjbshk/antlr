grammar Params;

params:QUESTION_MARK?param('&'param)*;

param: key '=' value;

key: ID;

value: Boolean      #BoolValue
     | Number       #NumValue
     | ID           #IDValue
     ;

QUESTION_MARK:'?';
Boolean: 'true' | 'false';
Number: Digit | Digit? '.' Digit;
ID:[0-9a-zA-Z_\-]+;
fragment Digit:[0-9]+;
//String: '"' (ESC | .)*? '"';
//fragment ESC: '\\'[rbnt\\];
WS: [ \r\n\t]+ -> skip;