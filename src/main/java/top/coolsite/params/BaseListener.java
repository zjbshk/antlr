package top.coolsite.params;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 基础监听器
 * @author: zhanjinbing
 * @data: 2019-10-26 14:27
 */
public class BaseListener extends ParamsBaseListener {


    private ParseTreeProperty<Object> parseTreeProperty = new ParseTreeProperty<>();
    public Map<String, Object> map = new HashMap<>();

    @Override
    public void exitParam(ParamsParser.ParamContext ctx) {
        String key = ctx.key().ID().getText();
        Object value = parseTreeProperty.get(ctx.value());
        map.put(key, value);
    }

    @Override
    public void enterBoolValue(ParamsParser.BoolValueContext ctx) {
        String text = ctx.getText();
        parseTreeProperty.put(ctx, Boolean.parseBoolean(text));
    }

    @Override
    public void enterNumValue(ParamsParser.NumValueContext ctx) {
        String text = ctx.getText();
        parseTreeProperty.put(ctx, Double.parseDouble(text));
    }

    @Override
    public void enterIDValue(ParamsParser.IDValueContext ctx) {
        String text = ctx.getText();
        parseTreeProperty.put(ctx, String.format("\"%s\"", text));
    }
}
