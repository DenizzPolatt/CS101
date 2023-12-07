public class Hackathon
{

    private static int MAX_NO_OF_PROJECTS = 6;
    private static int INDICATOR_COUNT = 4;
    private static int[] INDICATOR_WEIGHTS = {10, 25, 30, 35};

    private Project[] projects;
    private int projectCount = 0;
    

    Hackathon(int projectCount, Project [] projects)
    {
        this.projectCount = projectCount;
        this.projects = projects;
    }

    public void addProject(Project project)
    {
        if(projectCount <= MAX_NO_OF_PROJECTS)
        projects[projectCount - 1] = project;
        projectCount++;
        // project.setHackathon(Hackathon);
    }

    public String toString()
    {
        String str = "";
        
        str += "\nInitial Table\n";
        str += "***********************************************************************\n";
        str += String.format("%s %16s %16s %16s %16s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3", "Indicator 4\n");
        for(int i = 0; i < projects.length; i++)
        {
            str += projects[i].tableInitial();
        }
        str += "***********************************************************************\n\n";
        
        str += "\nModified Table\n";
        str += "***********************************************************************\n";
        str += String.format("%s %16s %16s %16s %16s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3", "Indicator 4\n");
        for(int i = 0; i < projects.length; i++)
        {
            str += projects[i].tableModified();
        }
        str += "***********************************************************************\n\n";


        str += "\nFinal Table\n";
        str += "**********************************************************************************************************************************************\n";
        str += String.format("%s %16s %16s %16s %16s %16s %16s %16s", "Project ID", "Indicator 1", "Indicator 2", "Indicator 3", "Indicator 4", "Weighted Mean", "Segment", "Credibility\n");
        for(int i = 0; i < projects.length; i++)
        {
            str += projects[i].tableFinal();
        }
        str += "\n**********************************************************************************************************************************************\n\n";

        return str;
    }

    //accessor methods;
    public int getMaxNoOfProjects() { return MAX_NO_OF_PROJECTS; }

    public int getIndicatorCount() { return INDICATOR_COUNT; }

    public int getIndicatorWeights(int i) { return INDICATOR_WEIGHTS[i]; }

    public int getProjectCount() { return projectCount; }

    //main method;
    public static void main(String[] args)
    {

        int [] rawScoresA1 = { 100, 240, 15, 26 };
        Project a1 = new Project("A1", rawScoresA1);


        int [] rawScoresA2 = { 20, 407, 13, 11 };
        Project a2 = new Project("A2", rawScoresA2);


        int [] rawScoresA3 = { 100, 281, 13, 39 };
        Project a3 = new Project("A3", rawScoresA3);

    
        int [] rawScoresA4 = { 80, 1264, 4, 38 };
        Project a4 = new Project("A4", rawScoresA4);

        int [] rawScoresA5 = { 20, 1020, 12, 11 };
        Project a5 = new Project("A5", rawScoresA5);


        int [] rawScoresA6 = {100, 1162, 17, 34 };
        Project a6 = new Project("A6", rawScoresA6);
        
        
        Project projects []= {a1, a2, a3, a4, a5, a6};

        Hackathon hack = new Hackathon(6, projects);
        // hack.addProject(a1);
        // hack.addProject(a2);
        // hack.addProject(a3);
        // hack.addProject(a4);
        // hack.addProject(a5);
        // hack.addProject(a6);
        System.out.println(hack);

        
    }

    
}
