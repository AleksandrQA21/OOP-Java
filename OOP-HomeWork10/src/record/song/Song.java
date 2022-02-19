package record.song;


import java.util.ArrayList;
import java.util.Objects;

public abstract class Song {
    private String name;
    private int length;
    private String format;
    private String style;


    public Song(String name, int length, String format, String style) {
        this.name = name;
        this.length = length;
        this.format = format;
        this.style = style;
    }

    public String getName() {
        return name;
    }
    public String getFormatformat(){
        return format;
    }
    public String getStyle(){return style;}
    public int duration(){
        return length;
    }


    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", format='" + format + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return length == song.length && name.equals(song.name) && format.equals(song.format) && style.equals(song.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, format, style);
    }
}
