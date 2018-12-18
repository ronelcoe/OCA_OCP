package com.oca8.modul8.api.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
	private static List<Student> studentList;
	public static List<Student> getStudents() {
		if (studentList == null) {
			studentList = new ArrayList<>();
			studentList.add(new Student("3523-16", "Ryan Las", 2016, 97.4f));
			studentList.add(new Student("4572-14", "Mary Macalintal", 2014, 93.2f));
			studentList.add(new Student("8334-18", "Joel De Los Reyes", 2018, 91.8f));
			studentList.add(new Student("6542-10", "Dian Augustin", 2010, 93.74f));
			studentList.add(new Student("8925-18", "Louie Garcia", 2018, 91.9f));
			studentList.add(new Student("7254-13", "Janette Evangelista", 2013, 91.3f));
			studentList.add(new Student("8723-18", "Ryan Chan", 2018, 89.1f));
			studentList.add(new Student("3253-18", "Ken Silva", 2018, 90.8f));
			studentList.add(new Student("4363-18", "Joey Tan", 2018, 83.9f));
			studentList.add(new Student("8532-17", "Enver Sy", 2017, 85.4f));
		}
		return studentList;
	}
}