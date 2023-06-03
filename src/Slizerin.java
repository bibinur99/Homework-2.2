public class Slizerin extends Hogwarts{
    //хитрость, решительность, амбициозность, находчивость и жажда власти
    private int cunning;
    private int  determination;
    private int  ambition;
    private int  resourcefulness;
    private int thirstForPower;

    public Slizerin(String name, String faculty, int magicPower, int distance,
                    int cunning, int determination, int ambition,
                    int resourcefulness, int thirstForPower) {
        super(name, faculty, magicPower, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }


    public static void compareTwoStudents(Slizerin stud1, Slizerin stud2){
        int score1 = stud1.getAmbition() + stud1.getResourcefulness()+ stud1.getCunning()+
                stud1.getDetermination()+stud1.getThirstForPower();
        int score2 = stud2.getAmbition() + stud2.getResourcefulness()+ stud2.getCunning()+
                stud2.getDetermination()+stud2.getThirstForPower();
        if (score1 > score2){
            System.out.println("more slizerin is " + stud1.getName() + " " + score1);
        } else if (score2 > score1) {
            System.out.println("more slizerin is " + stud2.getName() + " " + score2);
        } else {
            System.out.println("have the same scores" + stud1.getName() +" " + stud2.getName());
        }
    }
}
