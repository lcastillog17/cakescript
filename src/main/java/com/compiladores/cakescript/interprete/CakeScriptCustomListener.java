package com.compiladores.cakescript.interprete;

import java.util.HashMap;
import java.util.Map;

public class CakeScriptCustomListener extends CakeScriptBaseListener {
	
	private CakeScriptCustomSymbolTable symbolTable = new CakeScriptCustomSymbolTable();
    
	@Override
    public void enterNumero(CakeScriptParser.NumeroContext ctx) {
        String lexema = ctx.getText();
        String token = "numero";
        symbolTable.addSymbol(token, lexema);
    }

    @Override
    public void enterUnidad(CakeScriptParser.UnidadContext ctx) {
        String lexema = ctx.getText();
        String token = "unidad";
        symbolTable.addSymbol(token, lexema);
    }

    @Override
    public void enterVariable(CakeScriptParser.VariableContext ctx) {
        String lexema = ctx.getText();
        String token = "variable";
        symbolTable.addSymbol(token, lexema);
    }

    @Override
    public void enterComando(CakeScriptParser.ComandoContext ctx) {
        String lexema = ctx.getText();
        String token = "comando";
        symbolTable.addSymbol(token, lexema);
    }
    
    public Object[][] getSymbolTable() {
    	Object[][] matrix = new Object[symbolTable.getSymbolsTable().size()][3];
        Map<String, Integer> symbolsMap = new HashMap<>();
        int i = 0;
        for (String[] symbol : symbolTable.getSymbolsTable()) {
            String token = symbol[0];
            int firstRow = symbolsMap.getOrDefault(token, i);
            symbolsMap.putIfAbsent(token, i);
            matrix[i][0] = (firstRow == i) ? (i + 1) : matrix[firstRow][0];
            matrix[i][1] = token;
            matrix[i][2] = symbol[1];
            i++;
        }
        return matrix;
    }
}
