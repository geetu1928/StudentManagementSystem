package com.student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();

      
        Course course1 = new Course(101, "Mathematics");
        Course course2 = new Course(102, "Physics");
        Course course3 = new Course(103, "Chemistry");

        
        List<Course> courses1 = new ArrayList<>();
        courses1.add(course1);
        courses1.add(course2);
        studentDB.addStudent(new Student(1, "Alice", courses1));

        List<Course> courses2 = new ArrayList<>();
        courses2.add(course2);
        courses2.add(course3);
        studentDB.addStudent(new Student(2, "Bob", courses2));

        List<Course> courses3 = new ArrayList<>();
        courses3.add(course1);
        courses3.add(course3);
        studentDB.addStudent(new Student(3, "Charlie", courses3));

   
        List<Course> newCourses = new ArrayList<>();
        newCourses.add(course1);
        newCourses.add(course3);
        studentDB.updateStudent(2, "Bobby", newCourses);
        System.out.println("Student with ID 2: " + studentDB.getStudentById(2));
        System.out.println("-----------------------------------------");

     
        System.out.println("All Students: " + studentDB.getAllStudents());
        System.out.println("-----------------------------------------");

     
        System.out.println("Search for 'Alice': " + studentDB.searchStudentByName("Alice"));
        System.out.println("-----------------------------------------");

        studentDB.sortStudentsByName();
        System.out.println("Students sorted by name: " + studentDB.getAllStudents());
        System.out.println("-----------------------------------------");

   
        studentDB.sortStudentsById();
        System.out.println("Students sorted by ID: " + studentDB.getAllStudents());
        System.out.println("-----------------------------------------");

       
        studentDB.deleteStudent(1);
        System.out.println("All Students after deletion: " + studentDB.getAllStudents());
     }
}