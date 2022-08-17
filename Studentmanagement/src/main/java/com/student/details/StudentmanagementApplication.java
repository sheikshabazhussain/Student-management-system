package com.student.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.details.Repository.Studentrepository;
import com.student.details.entity.Student;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Autowired
	Studentrepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("sheik shabaz","hussain", "shabaz123@gmail.com");
//		studentrepository.save(student1);
//		
//		Student student2 = new Student("sara","aiman", "saraaiman56@gmail.com");
//		studentrepository.save(student2);
//		
//		Student student3 = new Student("md","anas", "mdanas5234@gmail.com");
//		studentrepository.save(student3);
//		
//		Student student4 = new Student("umme","rumana", "rumana1297@gmail.com");
//		studentrepository.save(student4);
	}

}
