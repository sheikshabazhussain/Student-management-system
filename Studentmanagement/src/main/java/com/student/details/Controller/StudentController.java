package com.student.details.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.student.details.Service.Studentservice;
import com.student.details.entity.Student;

@Controller
public class StudentController {

	
	private Studentservice studentservice;

	public StudentController(Studentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
	//handler method to handle list and return model and view
	
	@GetMapping("/students")
	public String getallstudents(Model model)
	{
		model.addAttribute("students", studentservice.getallstudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String addstudents(Model model)
	{
		//creating student object to hold student data form  
		Student student = new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	
	@PostMapping("/savestudents")
	public String savestudent(@ModelAttribute("student") Student student)
	{
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editteStudent(@PathVariable int id, Model model)
	{
		model.addAttribute("student",studentservice.getstudentById(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String updatestudent(@PathVariable int id,@ModelAttribute("student") Student student, Model model)
	{
		//get student from database by id
		Student existingstident = studentservice.getstudentById(id);
		existingstident.setId(id); 
		existingstident.setFirstname(student.getFirstname());
		existingstident.setLastname(student.getLastname());
		existingstident.setEmail(student.getEmail());
		
		//save updated student object
		studentservice.updateStudent(existingstident);
		return "redirect:/students";
		
	}
	
	//handler method to handle delete request
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentservice.deleteStudentById(id);
		return "redirect:/students";
	}
	
	
}
