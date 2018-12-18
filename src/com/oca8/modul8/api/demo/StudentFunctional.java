package com.oca8.modul8.api.demo;

public class StudentFunctional {

	public static void main(String[] args) {
		System.out.println(StudentData.getStudents().stream().filter(s -> s.getGraduationYear() == 2018)
				.max((s1, s2) -> Float.compare(s1.getGpa(), s2.getGpa())).get());
	}
}