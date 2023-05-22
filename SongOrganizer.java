import java.util.HashMap;

public class SongOrganizer {
    public static void main(String[] args) {
        // Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs with lyrics
        trackList.put("Song 1", "Lyrics for Song 1");
        trackList.put("Song 2", "Lyrics for Song 2");
        trackList.put("Song 3", "Lyrics for Song 3");
        trackList.put("Song 4", "Lyrics for Song 4");

        // Retrieve a song by its title
        String songTitle = "Song 2";
        String songLyrics = trackList.get(songTitle);
        System.out.println("Song: " + songTitle);
        System.out.println("Lyrics: " + songLyrics);

        // Print all the track names and lyrics
        for (String track : trackList.keySet()) {
            String lyrics = trackList.get(track);
            System.out.println("Track: " + track);
            System.out.println("Lyrics: " + lyrics);
            System.out.println();
        }
    }
}
