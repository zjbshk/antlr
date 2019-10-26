package top.coolsite.params;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.*;

/**
 * StudyAntlr
 *
 * @author DELL
 * @Date 2019/10/11
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            if ("test".equals(next)) {
                String s = sb.toString();
                sb.delete(0, s.length());
                test(s);
            } else {
                sb.append(next);
            }
        }
    }

    private static void test(String url) {
        int startIdx = url.indexOf("?");
        if (startIdx == -1) {
            startIdx = 0;
        }
        String address = url.substring(0, startIdx);
        if (address.length() != 0) {
            System.out.println("address = " + address);
        }
        String params = url.substring(startIdx);
        //对每一个输入的字符串，构造一个 CodePointCharStream
        CodePointCharStream cpcs = CharStreams.fromString(params);
        //用 cpcs 构造词法分析器 lexer，词法分析的作用是产生记号
        ParamsLexer lexer = new ParamsLexer(cpcs);
        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        ParamsParser parser = new ParamsParser(tokens);
        //移除错误监听器
        parser.removeErrorListeners();
        //添加自定义的错误分析器
        parser.addErrorListener(new MyANTLRErrorListener());


        //最终调用语法分析器的规则 prog，完成对表达式的验证
        ParamsParser.ParamsContext fileContext = parser.params();


        BaseListener baseListener = new BaseListener();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        parseTreeWalker.walk(baseListener, fileContext);

        Map<String, Object> map = baseListener.map;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        int size = map.size();
        int idx = 0;
        for (Map.Entry<String, Object> keyValue : map.entrySet()) {
            stringBuilder.append("\"")
                    .append(keyValue.getKey())
                    .append("\":")
                    .append(keyValue.getValue());
            if (idx < size - 1) {
                stringBuilder.append(",");
            }
            idx++;
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
}