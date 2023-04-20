package com.compiladores.cakescript.interprete;

public class CakeScriptCustomListener extends CakeScriptBaseListener {
	
	private CakeScriptCustomSymbolTable symbolTable = new CakeScriptCustomSymbolTable();
    
	@Override
    public void enterNumero(CakeScriptParser.NumeroContext ctx) {
        String nombre = ctx.getText();
        String tipo = "numero";
        symbolTable.addSymbol(tipo, nombre);
    }

    @Override
    public void enterUnidad(CakeScriptParser.UnidadContext ctx) {
        String nombre = ctx.getText();
        String tipo = "unidad";
        symbolTable.addSymbol(tipo, nombre);
    }

    @Override
    public void enterVariable(CakeScriptParser.VariableContext ctx) {
        String nombre = ctx.getText();
        String tipo = "variable";
        symbolTable.addSymbol(tipo, nombre);
    }

    @Override
    public void enterComando(CakeScriptParser.ComandoContext ctx) {
        String nombre = ctx.getText();
        String tipo = "comando";
        symbolTable.addSymbol(tipo, nombre);
    }
    
    public Object[][] getSymbolTable() {
        Object[][] matrix = new Object[symbolTable.getSymbolsTable().size()][3];
        int i = 0;
        for (String[] symbol : symbolTable.getSymbolsTable()) {
        	matrix[i][0] = i + 1;
            matrix[i][1] = symbol[0];
            matrix[i][2] = symbol[1];
            i++;
        }
        return matrix;
    }
}
