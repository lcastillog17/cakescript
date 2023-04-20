package com.compiladores.cakescript.interprete;

import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class CakeScriptCustomErrorListener extends BaseErrorListener {
    
    private List<String[]> errors = new ArrayList<>();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String[] error = new String[3];
        error[0] = String.valueOf(line);
        error[1] = String.valueOf(charPositionInLine);
        error[2] = msg;
        errors.add(error);
    }
    
    public List<String[]> getErrors() {
        return errors;
    }
    
    public Object[][] getErrorTable() {
        Object[][] matrix = new Object[errors.size()][3];
        int i = 0;
        for (String[] error : this.getErrors()) {
        	matrix[i][0] = error[0];
            matrix[i][1] = error[1];
            matrix[i][2] = error[2];
            i++;
        }
        return matrix;
    }
    
    public boolean hasErrors() {
    	return this.getErrors().size() > 0;
    }
    
    public void printErrorsTable() {
	    System.out.println("Tabla de errores:");
	    System.out.println("Linea\tColumna\tDescripcion");
	    for (String[] error : this.getErrors()) {
	        System.out.println(error[0] + "\t" + error[1] + "\t" + error[2]);
	    }
    }
    
}
