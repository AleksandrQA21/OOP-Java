package record.run;

import record.song.Song;
import record.song.Track1;
import record.song.Track2;
import record.song.Track3;
import record.style.Styles;
import record.tools.AlbumCreate;
import record.tools.SongDurationComparator;
import record.tools.SongPicker;
import record.tools.SongStyleComparator;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Init {
    public static void main(String[] args) {
        SongDurationComparator songDurationComparator = new SongDurationComparator();
        SongStyleComparator songStyleComparator = new SongStyleComparator();
        SongPicker songPicker = new SongPicker();

        Song track1 = new Track1("Billy Jine", 259, "MP3", Styles.POP.getStyle());
        Song track2 = new Track2("Forever Young", 185, "MP3", Styles.JAZZ.getStyle());
        Song track3 = new Track3("Yesterday", 362, "MP3", Styles.ROCK.getStyle());
        Song track4 = new Track3("California", 453, "MP3", Styles.ROCK.getStyle());
        Song track5 = new Track3("Opera №5", 600, "MP3", Styles.ROCK.getStyle());
        Song track6 = new Track3("Crazy Love", 135, "MP3", Styles.ROCK.getStyle());

        //Отрабатываю навыки создания через List
        List<Song>albumList = new ArrayList<>();
        albumList.add(track1);
        albumList.add(track2);
        albumList.add(track3);

        for (Song a:albumList) {
            System.out.println(a);
        }

        System.out.println("================");
        Song [] arr = new Song[]{track1,track2,track3,track4,track5,track6};
        AlbumCreate album2 = new AlbumCreate(arr);
        System.out.println("Общая длительность звучания альбома = " + album2.getAlbumTotalLength(arr) + " сек");
        System.out.println("================");

        // Сортировка по стилю композиций
        System.out.println("Sort by song's style: ");
        System.out.println("");
        String [] arr2 = new String[]{track1.getStyle(),track2.getStyle(),track3.getStyle(),track4.getStyle(),track5.getStyle(),track6.getStyle()};
        Arrays.sort(arr2,songStyleComparator);
        for (String s: arr2) {
            System.out.println(s);
        }

        System.out.println("================");


        // Сортировка на основе длительности композиций
        System.out.println("Sort by song's duration:");
        System.out.println("");
        Arrays.sort(arr,songDurationComparator);
        for (Song s:arr) {
            System.out.println(s.getName());
        }
        System.out.println("================");

        //Выбираем песню на основании заданному диапозону длительности композиции
        System.out.println("Pick song by specific duration range of the song: ");
        Song [] bigSongs = songPicker.getSongByBigLength(new Song[]{track1,track2,track3,track4,track5,track6});
        for (Song o: bigSongs) {
            System.out.println(o.getName());
        }
    }
}


