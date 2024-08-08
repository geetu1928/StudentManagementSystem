package com.student;

import java.util.Comparator;

public class StudentUtil {
	public static Comparator<Student> sortByName = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getStudentName().compareTo(s2.getStudentName());
        }
    };

    public static Comparator<Student> sortById = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getStudentId(), s2.getStudentId());
        }
    };

}