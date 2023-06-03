public class Puffendui extends Hogwarts{
    // трудолюбивы, верны, честны
    private int hardworking;
    private int  loyal;
    private int  honest;

    public Puffendui(String name, String faculty, int magicPower, int distance, int hardworking, int loyal, int honest){
        super(name,faculty, magicPower, distance);
        this.hardworking= hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public static void compareTwoStudents(Puffendui stud1, Puffendui stud2){
        int score1 = stud1.getHardworking() + stud1.getLoyal()+ stud1.getHonest();
        int score2 = stud2.getHardworking() + stud2.getLoyal()+ stud2.getHonest();
        if (score1 > score2){
            System.out.println("more puffendui is " + stud1.getName() + " " + score1);
        } else if (score2 > score1) {
            System.out.println("more puffendui is " + stud2.getName() + " " + score2);
        } else {
            System.out.println("have the same scores" + stud1.getName() +" " + stud2.getName());
        }
    }



}
