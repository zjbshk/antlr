// Generated from H:/ideaWorkspace/StudyAntlr/src/main/resources\Test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#csv}.
	 * @param ctx the parse tree
	 */
	void enterCsv(TestParser.CsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#csv}.
	 * @param ctx the parse tree
	 */
	void exitCsv(TestParser.CsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#hr}.
	 * @param ctx the parse tree
	 */
	void enterHr(TestParser.HrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#hr}.
	 * @param ctx the parse tree
	 */
	void exitHr(TestParser.HrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(TestParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(TestParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(TestParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(TestParser.FieldContext ctx);
}