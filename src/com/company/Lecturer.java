package com.company;

public class Lecturer {

    private static int id;
    private static String name;
    private static String address;
    private static int age;
    private static String department;
    private static String courses;

    public Lecturer(int id,String name,String address,int age,String department,String courses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.department = department;
        this.courses = courses;
    }

    public void teachCourse() {
        System.out.println(name + " with ID number " + id + " teaches " + courses);
    }

    public void supervises () {
        System.out.println("Lecturers who live at " + address + " supervise 10 students");
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Lecturer.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Lecturer.name = name;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Lecturer.address = address;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Lecturer.age = age;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        Lecturer.department = department;
    }

    public static String getCourses() {
        return courses;
    }

    public static void setCourses(String courses) {
        Lecturer.courses = courses;
    }
}
