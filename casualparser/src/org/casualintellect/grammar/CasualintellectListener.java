// Generated from Casualintellect.g4 by ANTLR 4.1
package org.casualintellect.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CasualintellectParser}.
 */
public interface CasualintellectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#states_before}.
	 * @param ctx the parse tree
	 */
	void enterStates_before(@NotNull CasualintellectParser.States_beforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#states_before}.
	 * @param ctx the parse tree
	 */
	void exitStates_before(@NotNull CasualintellectParser.States_beforeContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void enterLeft_brace(@NotNull CasualintellectParser.Left_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#left_brace}.
	 * @param ctx the parse tree
	 */
	void exitLeft_brace(@NotNull CasualintellectParser.Left_braceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(@NotNull CasualintellectParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(@NotNull CasualintellectParser.TransitionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#list_of_id}.
	 * @param ctx the parse tree
	 */
	void enterList_of_id(@NotNull CasualintellectParser.List_of_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#list_of_id}.
	 * @param ctx the parse tree
	 */
	void exitList_of_id(@NotNull CasualintellectParser.List_of_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(@NotNull CasualintellectParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(@NotNull CasualintellectParser.TransitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(@NotNull CasualintellectParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(@NotNull CasualintellectParser.StatesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void enterRight_brace(@NotNull CasualintellectParser.Right_braceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#right_brace}.
	 * @param ctx the parse tree
	 */
	void exitRight_brace(@NotNull CasualintellectParser.Right_braceContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#states_after}.
	 * @param ctx the parse tree
	 */
	void enterStates_after(@NotNull CasualintellectParser.States_afterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#states_after}.
	 * @param ctx the parse tree
	 */
	void exitStates_after(@NotNull CasualintellectParser.States_afterContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(@NotNull CasualintellectParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(@NotNull CasualintellectParser.Bool_exprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#states_in_process}.
	 * @param ctx the parse tree
	 */
	void enterStates_in_process(@NotNull CasualintellectParser.States_in_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#states_in_process}.
	 * @param ctx the parse tree
	 */
	void exitStates_in_process(@NotNull CasualintellectParser.States_in_processContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#bool_bin_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_bin_operation(@NotNull CasualintellectParser.Bool_bin_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#bool_bin_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_bin_operation(@NotNull CasualintellectParser.Bool_bin_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(@NotNull CasualintellectParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(@NotNull CasualintellectParser.StateContext ctx);

	/**
	 * Enter a parse tree produced by {@link CasualintellectParser#bool_un_operation}.
	 * @param ctx the parse tree
	 */
	void enterBool_un_operation(@NotNull CasualintellectParser.Bool_un_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CasualintellectParser#bool_un_operation}.
	 * @param ctx the parse tree
	 */
	void exitBool_un_operation(@NotNull CasualintellectParser.Bool_un_operationContext ctx);
}