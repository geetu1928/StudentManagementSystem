package com.student;

import java.util.List;

public class Student {
	private int studentId;
	private String studentName;
	private List<Course> courses;
	public Student(int studentId, String studentName, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courses = courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courses=" + courses + "]";
	}

}