package record.style;

public enum Styles {
    POP("Pop"),
    JAZZ("Jazz"),
    ROCK("Rock"),
    CLASSIC("Classic"),
    FOLK("Folk");

    private String style;

    Styles(String style) {
        this.style = style;
    }

    public String getStyle (){
        return style;
    }
}
