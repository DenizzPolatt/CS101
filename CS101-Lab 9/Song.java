/**
 * This class creates Song objects.
 * 
 * @author Deniz Polat
 */
public class Song implements Comparable<Song> 
{
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;

    /**
     * Registers the song to the system
     * @param title
     * @param artist
     * @param album
     * @param duration
     * @param timesPlayed
     */
    Song(String title, String artist, String album, int duration, int timesPlayed)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.timesPlayed = timesPlayed;
    }

    /**
     *compares the two songs relative to their durations
     */
    @Override
    public int compareTo(Song other) {
        if(duration == other.duration) {
            return 0;
        } else if (duration > other.duration) {
            return 1;
        }
        return -1;
    }

    /**
     * @return understandable stringrepresentation of a song object
     */
    @Override
    public String toString() {
        String str = "";
        str += "Song Name: " + getTitle() + "\n";
        str += "Artist Name: " + getArtist() + "\n";
        str += "Album Name: " + getAlbum() + "\n";
        str += "Duration: " + getPrettyDuration() + "\n";
        str += "Times played: " + getTimesPlayed() + "\n"; 
        str += "--------------------------------------------------------\n";
        return str;
    }

    /**
     * converts seconds to minutes
     * @return duration in the form of digital clock
     */
    private String getPrettyDuration()
    {
        String formattedMinutes =
            String.format("%02d", getDuration() / 60);
        String formattedSeconds =
            String.format("%02d", getDuration() % 60);
        return formattedMinutes + ":" + formattedSeconds;
    }
    
    //accessor methods

    /**
     * @return the title of the song
     */
    public String getTitle() { return title; }

    /**
     * @return the artist of the song
     */
    public String getArtist() { return artist; }

    /**
     * @return the album of the song
     */
    public String getAlbum() { return album; }

    /**
     * @return the duration of the song
     */
    public int getDuration() { return duration; }
     
    /**
     * @return the number of times that the song is played
     */
    public int getTimesPlayed() { return timesPlayed; }

    // setter methods

    /**
     * sets the title o the song
     * @param title
     */
    public void setTitle(String title) { this.title = title; }

    /**
     * sets the artist of the song
     * @param artist
     */
    public void setArtist(String artist) { this.artist = artist; }

    /**
     * sets the album of the song
     * @param album
     */
    public void setAlbum(String album) { this.album = album; }

    /**
     * sets the duration of the song
     * @param duration
     */
    public void setDuration(int duration) { this.duration = duration; }

    /**
     * sets the times that the song is played
     * @param timesPlayed
     */
    public void setTimesPlayed(int timesPlayed) { this.timesPlayed = timesPlayed; }

}