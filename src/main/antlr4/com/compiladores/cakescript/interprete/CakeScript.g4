grammar CakeScript;

receta: ingredientes pasos;

ingredientes: 'Ingredientes:' listaIngredientes;

listaIngredientes: (ingrediente)*;

ingrediente: variable '=' cantidad;

cantidad: numero (unidad)?;

numero: DIGITO+ ('.' DIGITO+)?;

unidad: ('tsp' | 'tbsp' | 'taza' | 'oz' | 'lb' | 'g' | 'kg');

variable: LETRA+;

pasos: 'Pasos:' listaPasos;

listaPasos: (paso)*;

paso: comando (parametros)?;

parametros: '(' listaParametros ')';

listaParametros: (parametro (',' parametro)*)?;

parametro: numero | variable;

comando: MIX | BATIR | HORNEAR | CONGELAR | DECORAR;

MIX: 'Mix';
BATIR: 'Batir';
HORNEAR: 'Hornear';
CONGELAR: 'Congelar';
DECORAR: 'Decorar';
    
LETRA: [a-zA-Z];
DIGITO: [0-9];

WS: [  \t\n\r]+ -> skip;
