class Course {
    String courseCode;
    String courseName;
    int creditHours;

    Course(String code, String name, int credits){
        courseCode=code;
        courseName=name;
        creditHours=credits;
    }

    void display(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }
}

public class CourseTest {
    public static void main(String[] args) {

        Course c1 = new Course("CS1004", "Object Oriented Programming", 3);
        Course c2 = new Course("MT1008", "MultiVariable Calculus", 3);

        c1.display();
        c2.display();
    }
}