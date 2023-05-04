package com.compiladores.cakescript.interprete;

import java.util.ArrayList;
import java.util.List;

public class CakeScriptCustomSymbolTable {
    
	private List<String[]> symbols = new ArrayList<>();
    
    public void addSymbol(String token, String lexema) {
        symbols.add(new String[]{token, lexema});
    }
    
    public List<String[]> getSymbolsTable() {
    	return symbols;
    }
}
