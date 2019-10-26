package top.coolsite.params;// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Params.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParamsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParamsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParamsParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ParamsParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamsParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ParamsParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParamsParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(ParamsParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(ParamsParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumValue(ParamsParser.NumValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDValue}
	 * labeled alternative in {@link ParamsParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDValue(ParamsParser.IDValueContext ctx);
}