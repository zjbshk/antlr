package top.coolsite.params;// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Params.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParamsParser}.
 */
public interface ParamsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParamsParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ParamsParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamsParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ParamsParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ParamsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ParamsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParamsParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(ParamsParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamsParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(ParamsParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(ParamsParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(ParamsParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumValue(ParamsParser.NumValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumValue(ParamsParser.NumValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIDValue(ParamsParser.IDValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIDValue(ParamsParser.IDValueContext ctx);
}