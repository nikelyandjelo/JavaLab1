package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class disk {
    private final song[] album ;
    public disk(song[] album){
        this.album = album;
    }
    public int lengthOfAlbum() {
        int length = 0;
        for(song track : album) {
            length += track.getLength();
        }
        return length;
    }

    public song[] songByGenre() {
        Comparator<song> songByGenre = Comparator.comparing(song::getGenre);
        Arrays.sort(album, songByGenre);
        return album;
    }

    public ArrayList<String> findByLength(int above, int below) {
        ArrayList<String> songByLength = new ArrayList<String>();
        for(song track  : album){
            if(track.getLength() >= above && track.getLength() <= below) {
                songByLength.add(track.getName());
            }
        }
        return songByLength;
    }
}
