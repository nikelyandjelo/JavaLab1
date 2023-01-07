package lab6;

import java.util.ArrayList;

public class lab6 {
    public static void main(String[] args) {
        jazz jazzSong = new jazz();
        rap rapSong = new rap();
        pop popSong = new pop();

        song[] songs = {jazzSong, rapSong, popSong};

        disk album = new disk(songs);

        System.out.printf("\n- Length of album: %d\n", album.lengthOfAlbum());

        System.out.println("\n- album before sorting: \n");

        for (song track : songs) {
            System.out.println(track.showData());
        }

        album.songByGenre();

        System.out.println("\n- Album after sorting: \n");

        for (song track : songs) {
            System.out.println(track.showData());
        }

        final int aboveLength = 110;
        final int belowLength = 220;

        final ArrayList<String> foundSongs = album.findByLength(aboveLength, belowLength);
        if (!foundSongs.isEmpty()) {
            System.out.printf("\n- Songs found: \n%s\n", foundSongs);
        } else {
            System.out.printf("\n- Songs not found, range: \nAbove: %d | Below: %d",
                    aboveLength, belowLength);
        }
    }
}
