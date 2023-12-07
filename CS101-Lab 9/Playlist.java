import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a collection of Song objects
 * 
 * @author Deniz Polat
 */
public class Playlist {
    
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs;

    /**
     * An empty constructor method
     */
    Playlist() {
        this.name = "";
        this.creator = "";
        this.genre = "";
        this.songs = new ArrayList<>();
    }

    /**
     * Constructor registers the playlist to the system
     * @param name
     * @param creator
     * @param genre
     * @param songs
     */
    Playlist(String name, String creator, String genre, ArrayList<Song> songs)
    {
        this.name = name;
        this.creator = creator;
        this.genre = genre;
        this.songs = songs;
    }

    /**
     * Checks whether the given song exists in the playlist
     * @param song
     * @return true if the given song exists in the playlist
     */
    public boolean songExists(Song song) {
        return songs.contains(song); 
    }

    /**
     * adds song to the playlist if the song doesn’t exist in the playlist
     * @param song
     */
    public void addSong(Song song) {
        if(!songExists(song))
        {
            songs.add(song);
        }
    }

    /**
     * removes the song from the playlist
     * @param song
     */
    public void removeSong(Song song) {
        songs.remove(song);
    }

    /**
     * Sorts the songs using Collections
     * @param songs
     */
    public void sortByDurationDesc() {
        Collections.sort(songs);
    }

    /**
     * return an informative representation of playlist including song name, 
     * artist name, genre and song object.
     */
    @Override
    public String toString() {
        String str = "";
        str += "--------------------------------------------------------\n";
        str += "Playlist name: " + getName() + "\n";
        str += "Creator name: " + getCreator() + "\n";
        str += "Genre: " + getGenre() + "\n";
        str += "--------------------------------------------------------\n";
        str += getSongsString() + "\n";
        return str;
    }

    /**
     * Creates a string containing songs in the arraylist.
     * @return the arraylist songs as a String
     */
    private String getSongsString()
    {
        String str = "";
        for (Song song : songs)
        {
            str += song;
        }
        return str;
    }

    // accessor methods

    /**
     * @return name of the playlist
     */
    public String getName() { return name; }

    /**
     * @return creator of the playlist
     */
    public String getCreator() { return creator; }

    /**
     * @return genre of the playlist
     */
    public String getGenre() { return genre; }

    /**
     * @return songs of the playlist
     */
    public ArrayList<Song> getSongs() { return songs; }

    // setter methods

    /**
     * sets the name of the playlist
     * @param name
     */
    public void setName(String name) { this.name = name; }

    /**
     * sets the creator of the playlist
     * @param name
     */
    public void setCreator(String creator) { this.creator = creator; }

    /**
     * sets the genre of the playlist
     * @param name
     */
    public void setGenre(String genre ) { this.genre = genre; }

    /**
     * sets the songs of the playlist
     * @param name
     */
    public void setSongs(ArrayList<Song> songs) { this.songs = songs; }
}
