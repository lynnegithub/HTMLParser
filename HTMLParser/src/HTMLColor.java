/**
 * Created by silence on 9/28/17.
 */
public enum HTMLColor {
    RED("\\color[RED]"),
    YELLOW("\\color[YELLOW]"),
    TURQUOISE("\\color[TURQUOISE]"),
    PINK("\\color[PINK]"),
    DARKGREEN("\\color[DARKGREEN]"),
    DARKOLIVEGREEN("\\color[DARKOLIVEGREEN]"),
    DARKSEAGREEN("\\color[DARKSEAGREEN]"),
    CHARTREUSE("\\color[CHARTREUSE]"),
    LAWNGREEN("\\color[LAWNGREEN]"),
    GREENYELLOW("\\color[GREENYELLOW]"),
    DARKGRAY("\\color[DARKGRAY]"),
    BLUE("\\color[BLUE]"),
    GREEN("\\color[GREEN]"),
    VIOLET("\\color[VIOLET]"),
    TAN("\\color[TAN]"),
    FIREBRICK("\\color[FIREBRICK]"),
    DARKORANGE("\\color[DARKORANGE]"),
    DARKSALMON("\\color[DARKSALMON]"),
    DARKORCHID("\\color[DARKORCHID]"),
    DARKCYAN("\\color[DARKCYAN]"),
    CRIMSON("\\color[CRIMSON]"),
    CORAL("\\color[CORAL]"),
    AQUAMARINE("\\color[AQUAMARINE]"),
    BURLYWOOD("\\color[BURLYWOOD]"),
    BROWN("\\color[BROWN]"),
    DARKRED("\\color[DARKRED]"),
    DARKSLATEBLUE("\\color[DARKSLATEBLUE]"),
    DEEPPINK("\\color[DEEPPINK]");

    private final String tag;
    HTMLColor(String tag){
        this.tag = tag;
    }
    public String toCode(){
        return this.tag;
    }

}
