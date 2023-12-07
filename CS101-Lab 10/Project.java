public class Project 
{
    //Static data members
    private static final int INITIAL = 0;
    private static final int MODIFIED = 1;
    private static final int FINAL = 2;



    //Instance data members
    private String ID;
    private double finalScore;
    private String segment = "?";
    private String credibility = "?";
    private int[] rawScores = new int[4];
    private int[] modifiedScores = new int[4];
    private Hackathon hackathon;


    //Constructor method takes values for and initializes the data
    //members ID and rawScores
    Project(String ID, int[] rawScores)
    {
        this.ID = ID;
        this.rawScores = rawScores;
        
        calcModifiedScores();
        
        calcWeightAvg();
        calcSegment();
        calcCredibility();
    }

    /**
     * method to update the elements of modifiedScores, which is initially
     * a copy of rawScores
     */
    public void calcModifiedScores()
    {
        modifiedScores[0] = rawScores[0];
        
        if(0 < rawScores[1] && rawScores[1] <= 500) modifiedScores[1] = 20;
        else if(500 < rawScores[1] && rawScores[1] <= 1000) 
            modifiedScores[1] = 80;
        else modifiedScores[1] = 100;

        if(0 < rawScores[2] && rawScores[2] <= 6) modifiedScores[2] = 100;
        else if(6 < rawScores[2] && rawScores[2] <= 12) modifiedScores[2] = 80;
        else modifiedScores[2] = 20;

        if(0 <= rawScores[3] && rawScores[3] < 10) modifiedScores[3] = 20;
        else if(10 <= rawScores[3] && rawScores[3] < 15) modifiedScores[3] = 80;
        else modifiedScores[3] = 100;
    }

    public void calcWeightAvg()
    {
        finalScore = 
            (((modifiedScores[0] * 10)
            + (modifiedScores[1] * 25)
            + (modifiedScores[2] * 30)
            + (modifiedScores[3] * 35)) / 100.0);
    }

    public void calcSegment()
    {

        if(finalScore == 100) segment = "A+";
        else if(finalScore >= 90 && finalScore < 100) segment = "A";
        else if(finalScore >= 75) segment = "B";
        else if(finalScore >= 60) segment = "C";
        else if(finalScore >= 40) segment = "D";

    }

    public void calcCredibility()
    {
        if(segment.equals("A+")) credibility = "Perfect";
        else if(segment.equals("A")) credibility = "Very Good";
        else if(segment.equals("B")) credibility = "Good";
        else if(segment.equals("C")) credibility = "Considerable";
        else if(segment.equals("D")) credibility = "Not appropriate";
    }


    public String tableInitial()
    {
        String str = "";

        str += String.format("%s", getID());
        str += String.format("%16d %16d %16d %16d\n", 
        getRawScores(0), getRawScores(1), 
        getRawScores(2), getRawScores(3));
        
        return str;
    }

    public String tableModified()
    {
        String str = "";
        str += String.format("%s", getID());
        str += String.format("%16d %16d %16d %16d\n", 
        getModifiedScores(0), getModifiedScores(1), 
        getModifiedScores(2), getModifiedScores(3));
        
        return str;
    }

    public String tableFinal()
    {
        String str = "";
        str += String.format("%s", getID());
        str += String.format("%16d %16d %16d %16d %16.1f %20s %20s\n", 
        getModifiedScores(0), getModifiedScores(1), 
        getModifiedScores(2), getModifiedScores(3), finalScore, segment, credibility);

        return str;
    }

    /**
     * method to access the hackathon reference
     * @return hackathon
     */
    public Hackathon getHackathon() { return hackathon; }

    /**
     * method to set the associated hackathon object
     * @param hackathon
     */

    public void setID(String ID) { this.ID = ID;}

    public void setModifiedScores(int[] modifiedScores) { this.modifiedScores = modifiedScores; }
    public void setHackathon(Hackathon hackathon) { this.hackathon = hackathon; }

    public String getID() { return ID; }

    public double getFinalScore() { return finalScore; }

    public int getRawScores(int i) { return rawScores[i]; }

    public int getModifiedScores(int i) { return modifiedScores[i]; }

    public String getCredibility() { return credibility; }

    public String getSegment() { return segment; }

    public void setCredibility(String credibility) { this.credibility = credibility; }

    public void setSegment(String segment) { this.segment = segment; }
    
}