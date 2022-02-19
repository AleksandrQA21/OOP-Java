package record.tools;

import com.chef.vegetables.type.Vegetable;
import record.song.Song;

import java.util.ArrayList;
import java.util.List;

public class SongPicker {
    public Song[] getSongByBigLength(Song[]songs){
        Song[] result = new Song[songs.length];
        List<Song> list = new ArrayList<>();
        for (int i = 0; i < songs.length; i++) {
            if(songs[i].duration() > 400){
                result[i] = songs[i];
            }
        }

        for (Song s:result) {
            if(s != null){
                list.add(s);
            }
        }
        return list.toArray(new Song[0]);
    }
}
