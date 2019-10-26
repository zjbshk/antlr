grammar Test;

csv: hr row*;
hr:row;
row: field(','field)* '\r'?'\n';

field: String | Number | Boolean;

Boolen: 'true' | 'false';
Number: Digit | Digit? '.' Digit;
fragment Digit:[0-9]+;
String: '\"' (ESC | .)*? '\"';
fragment ESC: '\\'[rbnt\\];
WS: [ \r\n\t]+ -> skip;