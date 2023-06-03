public class Cogtevran extends Hogwarts{
    // умны, мудры, остроумны и полны творчества
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Cogtevran(String name, String faculty, int magicPower, int distance,
                     int smart, int wise, int witty, int creativity) {
        super(name,faculty, magicPower, distance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void compareTwoStudents(Cogtevran stud1, Cogtevran stud2){
        int score1 = stud1.getSmart() + stud1.getCreativity()+ stud1.getWitty()+ stud1.getWise();
        int score2 = stud2.getSmart() + stud2.getCreativity()+ stud2.getWitty()+ stud2.getWise();
        if (score1 > score2){
            System.out.println("more cogtevran is " + stud1.getName() + " " + score1);
        } else if (score2 > score1) {
            System.out.println("more cogtevran is " + stud2.getName() + " " + score2);
        } else {
            System.out.println("have the same scores" + stud1.getName() +" " + stud2.getName());
        }
    }
    
}
