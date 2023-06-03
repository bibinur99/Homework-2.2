public class Hogwarts {
    private String name;
    private String faculty;
    private int magicPower;
    private int distance;


    public Hogwarts(String name, String faculty, int magicPower, int distance) {
        this.name = name;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.distance = distance;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    public static void compareTwoStudents(Hogwarts stud1, Hogwarts stud2) {
        int score1 = stud1.getMagicPower();
        int score2 = stud2.getMagicPower();
        int score3 = stud1.getDistance();
        int score4 = stud2.getDistance();
        if (score1 > score2) {
            System.out.println("more magic has " + stud1.getName() + " than " + stud2.getName()+ " , "+ score1);
        } else if (score2 > score1) {
            System.out.println("more magic has " + stud2.getName() + " than " + stud1.getName()+ " , " + score2);
        } else {
            System.out.println("have the same scores" + stud1.getName() + " , " + stud2.getName());
        }


        if (score3 > score4){
            System.out.println("more distance has " + stud1.getName() + " " + score1);
        } else if (score4 > score3) {
            System.out.println("more distance has " + stud2.getName() + " " + score2);
        } else {
            System.out.println("have the scores" + stud1.getName() +" " + stud2.getName());
        }

    }

}
