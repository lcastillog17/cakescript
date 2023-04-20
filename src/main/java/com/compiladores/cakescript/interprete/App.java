package com.compiladores.cakescript.interprete;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App extends JFrame {
	
	private static CakeScriptLexer lexer;
	private static CommonTokenStream tokens;
	private static CakeScriptParser parser;
	private static CakeScriptParser.RecetaContext tree;
	private static CakeScriptCustomVisitor visitor;
    
	private static JLabel labelCode;
	private static JTextArea textAreaCode;
	private static JButton button;
	private static JLabel labelSymbolsTable;
	private static DefaultTableModel tableSymbolsModel;
	private static JTable tableSymbols;
	private static JLabel labelErrorsTable;
	private static DefaultTableModel tableErrorsModel;
    private static JTable tableErrors;

    public App() {
        initComponents();
    }

    private void initComponents() {
        // Configuración de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("CakeScript");
        setPreferredSize(new Dimension(600, 450));
        
        // Creación de la label para el área de texto
        labelCode = new JLabel("Ingrese el código:");
        labelCode.setHorizontalAlignment(JLabel.CENTER);

        // Creación del área de texto
        textAreaCode = new JTextArea();
        textAreaCode.setRows(10);
        JScrollPane scroll = new JScrollPane(textAreaCode);

        // Creación del botón
        button = new JButton("Compilar");
        button.addActionListener(e -> compile());
        
        // Creación de la etiqueta para la tabla de simbolos
        labelSymbolsTable = new JLabel("Tabla de Simbolos");
        labelSymbolsTable.setHorizontalAlignment(JLabel.CENTER);

        // Creación de la tabla de simbolos
        tableSymbols = new JTable(0, 3);
        tableSymbols.getColumnModel().getColumn(0).setHeaderValue("ID");
        tableSymbols.getColumnModel().getColumn(1).setHeaderValue("Token");
        tableSymbols.getColumnModel().getColumn(2).setHeaderValue("Lexema");
        JScrollPane scrollTableSymbols = new JScrollPane(tableSymbols);
        
        // Creación del panel para la tabla de símbolos y su etiqueta
        JPanel panelSymbolsTable = new JPanel(new BorderLayout());
        panelSymbolsTable.add(labelSymbolsTable, BorderLayout.NORTH);
        panelSymbolsTable.add(scrollTableSymbols, BorderLayout.CENTER);
        
        // Creación de la etiqueta para la tabla de errores
        labelErrorsTable = new JLabel("Tabla de Errores");
        labelErrorsTable.setHorizontalAlignment(JLabel.CENTER);
        
        // Creación de la tabla de errores
        tableErrors = new JTable(0, 3);
        tableErrors.getColumnModel().getColumn(0).setHeaderValue("Linea");
        tableErrors.getColumnModel().getColumn(1).setHeaderValue("Columna");
        tableErrors.getColumnModel().getColumn(2).setHeaderValue("Descripción");
        JScrollPane scrollTableErrors = new JScrollPane(tableErrors);

        // Creación del panel para la tabla de errores y su etiqueta
        JPanel panelErrorsTable = new JPanel(new BorderLayout());
        panelErrorsTable.add(labelErrorsTable, BorderLayout.NORTH);
        panelErrorsTable.add(scrollTableErrors, BorderLayout.CENTER);
        
        // Configuración del layout y agregado de componentes
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(labelCode, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        // Creación del panel principal para las dos tablas y sus etiquetas
        JPanel panelTables = new JPanel(new GridLayout(1, 2));
        panelTables.add(panelSymbolsTable);
        panelTables.add(panelErrorsTable);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(panelTables, BorderLayout.CENTER);

        pack();
    }

    private void compile() {
    	
    	lexer = new CakeScriptLexer(new ANTLRInputStream(textAreaCode.getText()));
		tokens = new CommonTokenStream(lexer);
		parser = new CakeScriptParser(tokens);
		
		// TABLA DE ERRORES
		//---------------------------------------------------------------------------------------
		CakeScriptCustomErrorListener errorListener = new CakeScriptCustomErrorListener();
		parser.removeErrorListeners();
		parser.addErrorListener(errorListener);
		
		tree = parser.receta();

		if (errorListener.hasErrors()) {
			String[] tableErrorsColumns = {"Linea", "Columna", "Descripción"};
	        Object[][] tableErrorsData = errorListener.getErrorTable();
	        tableErrorsModel = new DefaultTableModel(tableErrorsData, tableErrorsColumns);
	        tableErrors.setModel(tableErrorsModel);
		} else {
	        tableErrors.setModel(new DefaultTableModel());
		}
		//---------------------------------------------------------------------------------------

		// TABLA DE SIMBOLOS
		//---------------------------------------------------------------------------------------
		CakeScriptCustomListener listener = new CakeScriptCustomListener();
		parser.addParseListener(listener);
		
		ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        
        String[] tableSymbolsColumns = {"ID", "Token", "Lexema"};
        Object[][] tableSymbolsData = listener.getSymbolTable();
        tableSymbolsModel = new DefaultTableModel(tableSymbolsData, tableSymbolsColumns);
        tableSymbols.setModel(tableSymbolsModel);
		//---------------------------------------------------------------------------------------
		
		visitor = new CakeScriptCustomVisitor();
		visitor.visit(tree);
    	
    }

    public static void main(String[] args) {
        App form = new App();
        form.setVisible(true);
    }
}