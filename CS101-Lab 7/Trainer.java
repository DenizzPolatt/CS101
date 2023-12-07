/**
 * This is the class for the trainers of the players in the Player class.
 */
public class Trainer {
    private String name;
    private String speciality;
    private boolean isPlayerCovid;
    private String lastTestDate;
    private String injuryStatus;
    private Player aPlayer;

    /**
     * The constructor method initializes name, speciality and aPlayer.
     * Initializes the player as COVID negative and last test date as null.
     * @param name
     * @param speciality
     * @param aPlayer
     */
    Trainer(String name, String speciality, Player aPlayer)
    {
        this.name = name;
        this.speciality = speciality;
        this.aPlayer = aPlayer;
        isPlayerCovid = false;
        lastTestDate = null;
    }

    /**
     * This mrthod updates the COVID status of the player.
     * @param isCovid
     * @param testDate
     */
    public void recordCovidTest(boolean isCovid, String testDate) 
    {
        isCovid = getCovidResult();
        lastTestDate = testDate;
    }

    /**
     * This method updates the injury status by modifying the variable injuryStatus.
     */
    public void updateInjuryStatus(String injuryStatus) 
    {
        this.injuryStatus = injuryStatus;
    }

    /**
     * toString method reports the health information of the player as a string.
     */
    public String toString()
    {
        String str = "";
        str += "************************************" + "\n";
        str += "Trainer name: " + name + "\n";
        str += "Trainer Speciality: " + speciality + "\n";
        str += "Player name: " + aPlayer.getName() + "\n";
        str += "Is COVID-19 positive?: " + getCovidResult() + "\n";
        str += "Last test date: " + lastTestDate + "\n";
        str += "Injury status: " + getInjuryStatus() + "\n";
        str += "************************************" + "\n";
        return str;
    }

    /**
     * @return Healthy if the value is null, gets the injury status.
     */
    public String getInjuryStatus()
    {
        if(injuryStatus == null) {
            injuryStatus = "Healthy";
        }

        return injuryStatus;
    }

    /**
     * @return the covid status of player.
     */
    public boolean getCovidResult()
    {
        return isPlayerCovid;
    }

}
