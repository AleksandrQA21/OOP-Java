package record.song;

import record.style.Styles;

import java.util.ArrayList;

public class Track2 extends Song{
    public Track2(String name, int length, String format, String style) {
        super(name, length, format, Styles.JAZZ.getStyle());
    }
}
