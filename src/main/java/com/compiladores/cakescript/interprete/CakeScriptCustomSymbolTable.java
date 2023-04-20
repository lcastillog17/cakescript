package com.compiladores.cakescript.interprete;

import java.util.ArrayList;
import java.util.List;

public class CakeScriptCustomSymbolTable {
    
	private List<String[]> symbols = new ArrayList<>();
    
    public void addSymbol(String name, String type) {
        symbols.add(new String[]{name, type});
    }
    
    public List<String[]> getSymbolsTable() {
    	return symbols;
    }
}

