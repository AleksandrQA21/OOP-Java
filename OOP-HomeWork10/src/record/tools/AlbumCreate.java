package record.tools;

import record.song.Song;

public class AlbumCreate implements Duratible {
    private Song [] album;

    public AlbumCreate(Song[] album) {
        this.album = album;
    }

    @Override
    public int getAlbumTotalLength(Song[] album){
        int result = 0;
        for (int i = 0; i < album.length; i++) {
            result += album[i].duration();
        }
        return result;
    }
}
