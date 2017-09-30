public enum HTMLTag {
    HTML(HTMLColor.RED),
    HEAD(HTMLColor.YELLOW),
    BODY(HTMLColor.TURQUOISE),
    BR(HTMLColor.PINK),
    H1(HTMLColor.DARKGREEN),
    H2(HTMLColor.DARKOLIVEGREEN),
    H3(HTMLColor.DARKSEAGREEN),
    H4(HTMLColor.CHARTREUSE),
    H5(HTMLColor.LAWNGREEN),
    H6(HTMLColor.GREENYELLOW),
    P(HTMLColor.DARKGRAY),
    A(HTMLColor.BLUE),
    TITLE(HTMLColor.GREEN),
    FORM(HTMLColor.VIOLET),
    INPUT(HTMLColor.TAN),
    TABLE(HTMLColor.FIREBRICK),
    TD(HTMLColor.DARKORANGE),
    TH(HTMLColor.DARKSALMON),
    TR(HTMLColor.CRIMSON),
    LI(HTMLColor.DARKORCHID),
    UL(HTMLColor.DARKCYAN),
    OL(HTMLColor.AQUAMARINE),
    OPTION(HTMLColor.CORAL),
    MENU(HTMLColor.BURLYWOOD),
    LINK(HTMLColor.BROWN),
    IMG(HTMLColor.DARKRED),
    HR(HTMLColor.DARKSLATEBLUE),
    META(HTMLColor.DEEPPINK);
    private final HTMLColor color;

    HTMLTag(HTMLColor color) {
        this.color = color;
    }

    public static HTMLColor getColor(String tag) {
        for (HTMLTag t : HTMLTag.values()) {
            if (tag.toUpperCase().equals(t.toString())) {
                return t.color;
            }
        }
        throw new IllegalArgumentException("Invalid tag name");
    }
}