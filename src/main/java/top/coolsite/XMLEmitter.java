package top.coolsite;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class XMLEmitter extends JSONBaseListener {
    public ParseTreeProperty<String> xml = new ParseTreeProperty<String>();

    String getXML(ParseTree ctx) {
        return xml.get(ctx);
    }

    void setXML(ParseTree ctx, String s) {
        xml.put(ctx, s);
    }

    @Override
    public void exitAtom(JSONParser.AtomContext ctx) {
        setXML(ctx, ctx.getText());
    }

    @Override
    public void exitArrayValue(JSONParser.ArrayValueContext ctx) {
        setXML(ctx, getXML(ctx.array()));
    }

    @Override
    public void exitString(JSONParser.StringContext ctx) {
        setXML(ctx, ctx.getText().replaceAll("\"", ""));
    }

    @Override
    public void exitObjectValue(JSONParser.ObjectValueContext ctx) {
        setXML(ctx, getXML(ctx.object()));
    }

    @Override
    public void exitPair(JSONParser.PairContext ctx) {
        String tag = ctx.STRING().getText().replace("\"", "");
        JSONParser.ValueContext vctx = ctx.value();
        String x = String.format("<%s>%s<%s>\n", tag, getXML(vctx), tag);
        setXML(ctx, x);
    }

    @Override
    public void exitAnObject(JSONParser.AnObjectContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSONParser.PairContext pctx : ctx.pair()) {
            buf.append(getXML(pctx));
        }
        setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyObject(JSONParser.EmptyObjectContext ctx) {
        setXML(ctx, "");
    }

    @Override
    public void exitArrayOfValues(JSONParser.ArrayOfValuesContext ctx) {
        StringBuilder buf = new StringBuilder();
        buf.append("\n");
        for (JSONParser.ValueContext vctx : ctx.value()) {
            buf.append("<element>")
                    .append(getXML(vctx))
                    .append("<element>")
                    .append("\n");
        }
        setXML(ctx, buf.toString());
    }

    @Override
    public void exitEmptyArray(JSONParser.EmptyArrayContext ctx) {
        setXML(ctx, "");
    }

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
        setXML(ctx, getXML(ctx.getChild(0)));
    }
}
