package com.company;

// Class Student
class Student {

    // Declaring attributes of the Student class
    private static int id;
    private static String name;
    private static String address;
    private static String course;
    private static int age;
    private static String email;

    // Creating a constructor
    // The constructor method is run everytime an object is created (instance of the class)
    public Student(int id, String name, String address, String course, int age, String email){
    // The constructor ties the values to the attributes
        this.id = id;
        this.name = name;
        this.address = address;
        this.course = course;
        this.age = age;
        this.email = email;
    }

    public void attendLecture(String lectureHall) {
        System.out.println(name + " is attending a lecture at " + lectureHall);
    }

    public void writeExam(){
        System.out.println("Student with id: " + id + " pursuing a BSc in " + course + " will write an exam" );

    }

    public void registerCourse(){
        System.out.println("Students above " + age + " can register a course in Sex Education" );
    }
}

public class Main {

    public static void main(String[] args) {

    // Instantiating the Student class by creating an instance of it
     Student yooku = new Student(234, "Yooku", "Cran Avenue", "Law", 23, "yooku@gmail.com");

     // Call the methods on the instance of the class
        yooku.attendLecture("N001");
        yooku.registerCourse();
        yooku.writeExam();

     Lecturer timOwusu = new Lecturer(42,"Tim Owusu", "David Collett", 50, "Computing", "Software eng");
        timOwusu.teachCourse();
        timOwusu.supervises();

        timOwusu.setName("Ama Owusu");
        timOwusu.teachCourse();


     // Course Class

        Course computerSystems = new Course(202, "Computer Systems", "Fundamentals of Computer Systems", 30, "Daniella R");

        computerSystems.update();
        computerSystems.cancel();














    }


}
