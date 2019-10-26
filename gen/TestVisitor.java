// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#csv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv(TestParser.CsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#hr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHr(TestParser.HrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(TestParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(TestParser.FieldContext ctx);
}