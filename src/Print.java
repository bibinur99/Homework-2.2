public class Print {
    public static void print(Hogwarts stud) {
        System.out.println(stud.getName() + " " + stud.getFaculty()+ " : " + " mag pow "+ stud.getMagicPower()+
                " dist "+ stud.getDistance()+ "; ");
    }


     public static void print(Griffindorf stud) {
        System.out.println(stud.getName() + " " + stud.getFaculty()+ " : mag pow " +stud.getMagicPower()+
                " dist "+ stud.getDistance()+ "; nobil"+ stud.getNobility()+ " honor "+ stud.getHonor()+
                " brave "+stud.getBravery() );
    }

     public static void print(Puffendui stud) {
        System.out.println(stud.getName() + " " + stud.getFaculty()+ ": mag pow " +stud.getMagicPower()+
               " dist "+ stud.getDistance() + "; hard work "
                + stud.getHardworking()+ " loyal "+ stud.getLoyal()+ " honest "+ stud.getHonest() );
    }

    public  static void print(Cogtevran stud) {
        System.out.println(stud.getName() + " " + stud.getFaculty() + ": mag pow " + stud.getMagicPower() +
               " dist "+ stud.getDistance() + "; smart " +stud.getSmart() + " wise " + stud.getWise() +
                " wit " + stud.getWitty() + " creav " +  stud.getCreativity());
    }
    public static void print(Slizerin stud) {
      System.out.println(stud.getName() + " " + stud.getFaculty()+ ": mag pow " +stud.getMagicPower()+
              " dist "+ stud.getDistance()+ "; cunn " +
              stud.getCunning() + " detrm "+ stud.getDetermination()+ " ambit "+ stud.getAmbition()+
              " resourc "+ stud.getResourcefulness()+ "  thirst "+ stud.getThirstForPower());
    }



}
