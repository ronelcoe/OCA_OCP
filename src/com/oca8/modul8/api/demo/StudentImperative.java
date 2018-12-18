package com.oca8.modul8.api.demo;

import java.util.List;

public class StudentImperative {

	public static void main(String[] args) {
		List<Student> studentList = StudentData.getStudents();
		
		Student highestStudent = null;
		
		for(int iterator = 0; iterator < studentList.size(); iterator++) {
			Student student = studentList.get(iterator);
			if (student.getGraduationYear() == 2018) {
				if (highestStudent == null)
					highestStudent = student;
				
				if (student.getGpa() > highestStudent.getGpa())
					highestStudent = student;
			}
		}
		System.out.println(highestStudent);
		
		
		
		

		
//		for(Student student : studentList) {
//			if (student.getGraduationYear() == 2018) {
//				if (highestStudent == null)
//					highestStudent = student;
//				
//				if (student.getGpa() > highestStudent.getGpa())
//					highestStudent = student;
//			}
//		}
//		System.out.println(highestStudent);
	}

}
