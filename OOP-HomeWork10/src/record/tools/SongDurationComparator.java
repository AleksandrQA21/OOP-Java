package record.tools;

import record.song.Song;

import java.util.Comparator;

public class SongDurationComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.duration() - o2.duration();
    }
}
