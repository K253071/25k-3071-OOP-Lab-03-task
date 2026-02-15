class Programmer {
    int programmerID;
    String programmerName;
    String prefferedProgrammingLanguage;
    int noOfProblemsSolved;

    Programmer(int ID, String name, String language, int problems){
        programmerID=ID;
        programmerName=name;
        prefferedProgrammingLanguage=language;
        noOfProblemsSolved=problems;
    }

    void display(){
        System.out.println("Programmer ID: " + programmerID);
        System.out.println("Programmer Name: " + programmerName);
        System.out.println("Preffered Programming Language: " + prefferedProgrammingLanguage);
        System.out.println("Number of Problems Solved: " + noOfProblemsSolved);
        System.out.println("|----------------------------------|");

    }
}

public class Programmers {
    public static void main(String[] args) {
        Programmer p1 = new Programmer(1, "Asad", "Python", 10);
        Programmer p2 = new Programmer(2, "Hamdan", "C++", 15);
        Programmer p3 = new Programmer(3, "Saad", "Java", 12);

        p1.display();
        p2.display();
        p3.display();
    }
}