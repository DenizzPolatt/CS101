import java.util.ArrayList;
import java.util.Scanner;

/**
 * This MusicApp allows users to create playlists, display playlists, add or remove songs and sort them.
 * 
 * @author Deniz Polat
 */
public class MusicApp {
 
    public static void main(String[] args) {

        printMenu();

        ArrayList<Playlist> allPlaylists = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int option = readInt(in);

        Playlist lastPlaylist = new Playlist();
        do {
            if(option == 1) {
                lastPlaylist = createPlaylist(in, allPlaylists);
            }  
            else if(option == 2) {
                System.out.println("Displaying the playlist: ");
                displayPlaylist(lastPlaylist);
            }
            else if(option == 3) {
                System.out.println("Sorted playlist: ");
                lastPlaylist.sortByDurationDesc();
                System.out.println(lastPlaylist);
            }
            else if(option == 4) {
                removeSongByIndex(in, lastPlaylist);
            }   
            else if(option == 5) {
                System.out.println("All playlists: ");
                displayPlaylists(allPlaylists);
            }

            printMenu();

            option = readInt(in);
        } while(option != 6);

        in.close();
    }

    public static void printMenu()
    {
        System.out.println(
            "--------------------------------------------------------");
        System.out.println(
            "Welcome to Music App! Get Ready to create your playlist!");
        System.out.println("1 - Create a new Playlist ");
        System.out.println("2 - Display the Playlist ");
        System.out.println("3 - Sort the Playlist ");
        System.out.println(
            "4 - Remove song by index from the current Playlist");
        System.out.println("5 - Display all Playlists ");
        System.out.println("6 - Exit");
    }

    /**
     * This method prints the login menu for the application.
     * @param usernames
     * @param passwords
     * @param in
     */
    public static Playlist createPlaylist(Scanner in, ArrayList<Playlist> allPlaylists)
    {
        Playlist newPlaylist = new Playlist(); 

        System.out.println(
                "How many songs do you want to add to playlist?");
            int numberOfSongs = readInt(in);

        for(int i = 0; i < numberOfSongs; i++)
        {
            int songNumber = i + 1;
            
            System.out.println(
                "Enter artist name for Song " + songNumber + ":");
            String artistName = in.nextLine();

            System.out.println(
                "Enter album name for Song " + songNumber + ":");
            String albumName = in.nextLine();

            System.out.println(
                "Enter song name for Song " + songNumber + ":");
            String songName = in.nextLine();

            System.out.println(
                "Enter song duration in seconds for Song " 
                + songNumber + ":");
            int songDuration = readInt(in);

            System.out.println(
                "Enter the times song has been played for Song " 
                + songNumber + ":");
            int songTimesPlayed = readInt(in);

            Song song = new Song(
                songName, 
                artistName, 
                albumName, 
                songDuration, 
                songTimesPlayed);

            newPlaylist.addSong(song);
        }

        System.out.println("Enter playlist name: ");
        newPlaylist.setName(in.nextLine());

        System.out.println("Enter creator of playlist: ");
        newPlaylist.setCreator(in.nextLine());

        printGenreMenu();
        System.out.println("Select genre of playlist: ");
        newPlaylist.setGenre(getGenreName(readInt(in)));

        allPlaylists.add(newPlaylist);
        return newPlaylist;
    }

    /**
     * This method displays the playlist that is created.
     * @param playlist
     */
    public static void displayPlaylist(Playlist playlist)
    {
        System.out.println(playlist);
    }

    /**
     * This method removes song from a playlist
     * @param in
     * @param playlist
     */
    public static void removeSongByIndex(Scanner in, Playlist playlist)
    {
        System.out.println(
            "Which song do you want to remove? (Remove by index)");
        int index = readInt(in);
        Song song = playlist.getSongs().get(index);
        playlist.removeSong(song);
    }

    /**
     * This method displayes all the playlists that are created
     * @param playlists
     */
    public static void displayPlaylists(ArrayList<Playlist> playlists) 
    {
        for (Playlist playlist : playlists) 
        {
            displayPlaylist(playlist);
        }
    }

    /**
     * This method prints the Genre Menu.
     */
    public static void printGenreMenu()
    {
        int genreCount = 6;
        for(int i = 0; i < genreCount; i++)
            System.out.println(i + " - " + getGenreName(i));
    }

    /**
     * This method returns the name of the genre due to the option number
     * @param genreOption
     * @return
     */
    public static String getGenreName(int genreOption)
    {
        if(genreOption == 0) return "Country";
        if(genreOption == 1) return "Electronic";
        if(genreOption == 2) return "Pop Music";
        if(genreOption == 3) return "Rock Music";
        if(genreOption == 4) return "Jazz";
        if(genreOption == 5) return "Classical";
        return "";  
    }

    /**
     * This method puts an empty nextLine() after nextInt()
     * @param in
     * @return
     */
    public static int readInt(Scanner in)
    {
        int i = in.nextInt();
        in.nextLine();
        return i;
    }
}
