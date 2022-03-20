package com.company;

public class Course {

    private static int ID;
    private static String name;
    private static String description;
    private static int capacity;
    private static String lecturer;

    public Course(int ID,String name,String description,int capacity,String lecturer) {

        this.ID = ID;
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.lecturer = lecturer;
    }

    public void update() {

        System.out.println(ID + name + " is going to be updated for the next academic year");
    }

    public void cancel() {

        System.out.println(" The " + name + " class taught by " + lecturer + " is going to be cancelled because it has surpassed its capacity of " + capacity );

    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Course.ID = ID;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Course.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Course.description = description;
    }

    public static int getCapacity() {
        return capacity;
    }

    public static void setCapacity(int capacity) {
        Course.capacity = capacity;
    }

    public static String getLecturer() {
        return lecturer;
    }

    public static void setLecturer(String lecturer) {
        Course.lecturer = lecturer;
    }
}
