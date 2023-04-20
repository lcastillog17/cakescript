// Generated from com/compiladores/cakescript/interprete/CakeScript.g4 by ANTLR 4.5.1
package com.compiladores.cakescript.interprete;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CakeScriptParser}.
 */
public interface CakeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#receta}.
	 * @param ctx the parse tree
	 */
	void enterReceta(CakeScriptParser.RecetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#receta}.
	 * @param ctx the parse tree
	 */
	void exitReceta(CakeScriptParser.RecetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(CakeScriptParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(CakeScriptParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#listaIngredientes}.
	 * @param ctx the parse tree
	 */
	void enterListaIngredientes(CakeScriptParser.ListaIngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#listaIngredientes}.
	 * @param ctx the parse tree
	 */
	void exitListaIngredientes(CakeScriptParser.ListaIngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(CakeScriptParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(CakeScriptParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void enterCantidad(CakeScriptParser.CantidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#cantidad}.
	 * @param ctx the parse tree
	 */
	void exitCantidad(CakeScriptParser.CantidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(CakeScriptParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(CakeScriptParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#unidad}.
	 * @param ctx the parse tree
	 */
	void enterUnidad(CakeScriptParser.UnidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#unidad}.
	 * @param ctx the parse tree
	 */
	void exitUnidad(CakeScriptParser.UnidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CakeScriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CakeScriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#pasos}.
	 * @param ctx the parse tree
	 */
	void enterPasos(CakeScriptParser.PasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#pasos}.
	 * @param ctx the parse tree
	 */
	void exitPasos(CakeScriptParser.PasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#listaPasos}.
	 * @param ctx the parse tree
	 */
	void enterListaPasos(CakeScriptParser.ListaPasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#listaPasos}.
	 * @param ctx the parse tree
	 */
	void exitListaPasos(CakeScriptParser.ListaPasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(CakeScriptParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(CakeScriptParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(CakeScriptParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(CakeScriptParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(CakeScriptParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(CakeScriptParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(CakeScriptParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(CakeScriptParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CakeScriptParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CakeScriptParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CakeScriptParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CakeScriptParser.ComandoContext ctx);
}