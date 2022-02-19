package record.tools;

import record.song.Song;

import java.util.Comparator;

public class SongStyleComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1 == o2){
            return 0;
        }
        else if (o1 == null){
            return  -1;
        }
        else if (o2 == null){
          return  1;
        }
        return o1.compareTo(o2);
    }
}
