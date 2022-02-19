package record.song;

import record.style.Styles;

import java.util.ArrayList;

public class Track1 extends Song{
    public Track1(String name, int length, String format, String style) {
        super(name, length, format, Styles.POP.getStyle());
    }

}
