package top.coolsite.json;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Scanner;

/**
 * StudyAntlr
 *
 * @author DELL
 * @Date 2019/10/11
 */
public class Main {

    public static void main(String[] args) throws IOException {
        scanner();
    }

    private static void scanner() {
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

    private static void test(String msg) {
        CharStream inputStream = CharStreams.fromString(msg);
        JSONLexer lexer = new JSONLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        XMLEmitter xml = new XMLEmitter();
        ParseTree json = parser.json();
        walker.walk(xml, json);
        System.out.println(xml.xml.get(json));
    }


}