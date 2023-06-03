public class Griffindorf extends Hogwarts{
    // благородство, честь и храбрость
    private int nobility;
    private  int honor ;
    private int bravery;

    public Griffindorf(String name, String faculty, int magicPower, int distance,
                       int nobility, int honor, int bravery){
        super(name, faculty, magicPower, distance);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility=nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public static void compareTwoStudents(Griffindorf stud1, Griffindorf stud2){
        int score1 = stud1.getNobility() + stud1.getHonor()+ stud1.getBravery();
        int score2 = stud2.getNobility() + stud2.getHonor()+ stud2.getBravery();
        if (score1 > score2){
            System.out.println("more griffindorf is " + stud1.getName() + " " + score1);
        } else if (score2 > score1) {
            System.out.println("more griffindorf is " + stud2.getName() + " " + score2);
        } else {
            System.out.println("have the same scores" + stud1.getName() +" " + stud2.getName());
        }
    }


}
