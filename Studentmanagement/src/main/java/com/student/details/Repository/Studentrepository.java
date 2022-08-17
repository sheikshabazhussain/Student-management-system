package com.student.details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.details.entity.Student;

public interface Studentrepository extends JpaRepository<Student, Integer>{
	
	

}
