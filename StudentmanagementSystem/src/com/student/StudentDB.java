package com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentDB {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int id, String name, List<Course> courses) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                student.setStudentName(name);
                student.setCourses(courses);
                return;
            }
        }
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public void sortStudentsByName() {
        Collections.sort(students, StudentUtil.sortByName);
    }

    public void sortStudentsById() {
        Collections.sort(students, StudentUtil.sortById);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getStudentId() == id);
    }
}