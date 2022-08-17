package com.student.details.Service;

import java.util.List;

import com.student.details.entity.Student;

public interface Studentservice {

	List<Student> getallstudents();
	
	Student saveStudent(Student student);
	
	Student getstudentById(int id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(int id); 
	
}
