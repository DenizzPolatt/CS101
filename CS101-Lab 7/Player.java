/**
 * This class is created to show statistics of each basketball players.
 * @author Deniz Polat
 */
public class Player {
    private static final int ID_NOT_REGISTERED = -1;

    //static data members
    private static int count;
    private static int allCount;

    //instance data members
    private int id = ID_NOT_REGISTERED;
    private String name;
    private String position;
    private String team;
    private int rosterNumber;
    private boolean isActive;
    
    //statistics
    private int gamesPlayed;
    private double pointsPerGame;
    private double assistsPerGame;
    private double reboundsPerGame;
    private double turnoversPerGame;
    
    /**
     * Constructor method.
     * @param name
     * @param position
     * @param team
     * @param rosterNumber
     */
    Player(String name, String position, String team, int rosterNumber) {
        this.name = name;
        this.position = position;
        this.team = team;
        this.rosterNumber = rosterNumber;
        register();
    }

    /**
     * this method calculates the updated average game records.
     * @param oldAverage
     * @param newValue
     * @return expression for updated average of the game records.
     */
    private double calculateUpdatedAverage(double oldAverage, int newValue)
    {
        return (oldAverage * gamesPlayed + newValue) / (gamesPlayed + 1);
    }

    /**
     * This method takes number of points, assists, rebounds and turnovers 
     * for the game to be recorded and updates per game statistics defined 
     * above accordingly.
     * @param points
     * @param assists
     * @param rebounds
     * @param turnovers
     */
    public void recordGame(int points, int assists, int rebounds, int turnovers)
    {
        pointsPerGame = calculateUpdatedAverage(pointsPerGame, points);
        assistsPerGame = calculateUpdatedAverage(assistsPerGame, assists);
        reboundsPerGame = calculateUpdatedAverage(reboundsPerGame, rebounds);
        turnoversPerGame = calculateUpdatedAverage(turnoversPerGame, turnovers);
        gamesPlayed++;
    }

    /**
     * @return the expression to calculate efficiency of a player.
     */
    public double getEfficiency() {
        return (1.0 * pointsPerGame) + (0.7 * assistsPerGame) 
            + (0.7 * reboundsPerGame) - (0.9 * turnoversPerGame);
    }

    /**
     * @param other
     * @return true if the efficiency of this player is larger than other 
     * player's efficiency.
     */
    public boolean isMoreEfficient(Player other) {
        return getEfficiency() > other.getEfficiency();
    }

    /**
     * toString method returns a string representation that contains all the 
     * information stored about the player.
     */
    public String toString() {
        String str = "";
        str += "**************************************************\n";
        str += "Player ID: " + id + "\n";
        str += "Player Name: " + name + "\n";
        str += "Player Position: " + position + "\n";
        str += "Current Team: " + team + "\n";
        str += "Jersey Number: " + rosterNumber + "\n";
        str += "--------------------------------------------------\n";
        str += "Stats: \n";
        str += String.format("PPG: %.2f \n", pointsPerGame);
        str += String.format("APG: %.2f \n", assistsPerGame);
        str += String.format("RPG: %.2f \n", reboundsPerGame);
        str += String.format("TPG: %.2f \n", turnoversPerGame);
        str += String.format("Efficiency: %.2f \n", getEfficiency());
        str += "--------------------------------------------------\n";
        if(isActive) {
            str += 
                "Retirement Status: Active among " + 
                count + " active player(s)\n";
        } else {
            str += 
                "Retirement Status: Retired among " + 
                (allCount - count) + " inactive player(s)\n";
        }
        str += "**************************************************\n";
        
        return str;
    }

    /**
     * this method registers the player by giving them an id and updates count, 
     * allcount accordingly
     */
    public void register() {
        if(id == ID_NOT_REGISTERED){
            allCount++;
            id = allCount;
            count++;
            isActive = true;
        }
    }

    /**
     * this method removes the player and unregisteres the id.
     */
    public void remove() {
        if(id != ID_NOT_REGISTERED) {
            id = ID_NOT_REGISTERED;
            retire();
        }
    }

    /**
     * this method retires the player
     */
    public void retire() {
        if(isActive) {
            isActive = false;
            count--;
        }
    }

    /**
     * This method transfers the player to another team.
     * First checks if the new team is different from the current.
     * @param team
     */
    public void transfer(String team) {
        if(this.team.equals(team)) {
            System.out.println("Already in that team");
        } else {
            this.team = team;
        }
    }
    
    /**
     * This method checks if the given position is a valid string.
     * @param position
     * @return
     */
    private static boolean isValidPosition(String position)
    {
        return 
            position.equals("SF") || 
            position.equals("PF") || 
            position.equals("SG") || 
            position.equals("PG") || 
            position.equals("C");
    }

    /**
     * sets the position of the player
     */
    public void setPosition(String position) {
        if(isValidPosition(position)) {
            this.position = position;
        } else {
            System.out.println("Invalid position input.");
        }
    }

    /**
     * @param other
     * @return true if the name of this player is before than the other player.
     */
    public boolean isBeforeThan(Player other) {
        return name.compareTo(other.name) < 0;
    }

    //accessor methods

    /**
     * this method accesses the name of the player.
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * this method accesses the id of the player.
     * @return id of the player
     */
    public int getID() {
        return id;
    }

    /**
     * this method accesses the position of the player.
     * @return the position of the player
     */
    public String getPosition() {
        return position;
    }
    /**
     * this method accesses the team of the player.
     * @return
     */
    public String getTeam() {
        return team;
    }

    /**
     * this method accesses the roster number of the player.
     * @return the roster number
     */
    public int getRosterNumber() {
        return rosterNumber;
    }

    /**
     * @return true if the player is active
     */
    public boolean isActive() {
        return isActive;
    }

    //setter methods

    /**
     * updates the name for each player
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * updates the roster number for each player
     * @param rosterNumber
     */
    public void setRosterNumber(int rosterNumber) {
        this.rosterNumber = rosterNumber;
    }
}
