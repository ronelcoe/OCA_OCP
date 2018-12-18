package com.oca8.modul8.api.demo;

public class Student {

	private String studentId; 
	private String name;
	private int graduationYear;
	private float gpa;
	
	public Student(String studentId, String name, int graduationYear, float gpa) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.graduationYear = graduationYear;
		this.gpa = gpa;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return "Student Id: " + this.getStudentId() + "\nName: " + this.getName() + "\nGPA: " + this.getGpa() + "\nYear graduted " + this.getGraduationYear();
	}
}
