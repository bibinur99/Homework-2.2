import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts students:");
        Hogwarts student1 =    new Hogwarts("Harry Potter", "Griffindorf", 90, 90);
        Hogwarts student2 =  new Hogwarts("Germiona Grandger", "Griffindorf", 70, 80);
        Hogwarts student3 = new Hogwarts("Rohn Wisly", "Griffindorf", 80, 50);
        Hogwarts student4 = new Hogwarts("Zakhariya Smith", "Puffendui", 60, 43);
        Hogwarts student5 =  new Hogwarts("Sedrick Diggori", "Puffendui", 30, 69);
        Hogwarts student6=  new Hogwarts("Justin Finnch", "Puffendui", 59, 78);
        Hogwarts student7= new Hogwarts("Chou Chang", "Cogtevran", 47, 55);
        Hogwarts student8 =  new Hogwarts("Padma Patil", "Cogtevran", 39, 60);
        Hogwarts student9 = new Hogwarts("Marcus Belby", "Cogtevran", 67,23);
        Hogwarts student10 =  new Hogwarts("Draco Mulfoy", "Slizerin", 48,56);
        Hogwarts student11 =  new Hogwarts("Graham Montegu", "Slizerin", 89, 56);
        Hogwarts student12 =  new Hogwarts("Gregory Goil", "Slizerin", 37, 29);


        //Гарри Поттер, Гермиона Грейнджер и Рон Уизли
        Griffindorf griffindorf1 = new Griffindorf("Harry Potter", "Griffindorf", 90, 90,
                90, 99,99);
        Griffindorf griffindorf2 = new Griffindorf("Germiona Grandger", "Griffindorf", 70, 80,
                85, 80, 78);
        Griffindorf griffindorf3 =   new Griffindorf("Rohn Wisly", "Griffindorf", 80, 50,
                79, 85, 67);

        //Захария Смит, Седрик Диггори, Джастин Финч-Флетчли
        Puffendui puffendui1 = new Puffendui("Zakhariya Smith", "Puffendui", 60, 43,
                45, 36, 59);
        Puffendui puffendui2 = new Puffendui("Sedrick Diggori", "Puffendui", 30, 69 ,
                78, 45, 30);
        Puffendui puffendui3 = new Puffendui("Justin Finnch", "Puffendui",59, 78,
                38, 29, 56);

        // Чжоу Чанг, Падма Патил и Маркус Белби
        Cogtevran cogtevran1 = new Cogtevran("Chou Chang", "Cogtevran",47, 55,
                45, 67, 27,48);
        Cogtevran cogtevran2 = new Cogtevran("Padma Patil", "Cogtevran", 39, 60,
                27, 35, 67,35);
        Cogtevran cogtevran3 = new Cogtevran("Marcus Belby", "Cogtevran", 67, 23,
                37, 43, 27, 90);


        // Драко Малфой, Грэхэм Монтегю, Грегори Гойл
        Slizerin slizerin1 = new Slizerin("Draco Mulfoy", "Slizerin",48, 56,  56,
                78,90,46,99);
        Slizerin slizerin2 = new Slizerin("Graham Montegu", "Slizerin", 89, 56, 45, 46,
                55, 30, 80);
        Slizerin slizerin3 = new Slizerin("Gregory Goil", "Slizerin",37, 29, 35,44,
                55,78,51);


        Print.print(student5);
        Print.print(griffindorf1);
        Print.print(slizerin2);
        Cogtevran.compareTwoStudents(cogtevran1,cogtevran3);
        Hogwarts.compareTwoStudents(student3,student7);

    }
}