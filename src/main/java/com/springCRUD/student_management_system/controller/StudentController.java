package com.springCRUD.student_management_system.controller;

import java.util.List;

import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.springCRUD.student_management_system.Entity.Student;
import com.springCRUD.student_management_system.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentrepository;
	
	//Get all the student
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> students=studentrepository.findAll();
		return students;
		
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id){
		Student stu=studentrepository.findById(id).get();
		return stu;
	}
	@PostMapping("/students/add")
	@ResponseStatus(code= HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student){
		studentrepository.save(student);
	}

	@PutMapping("/students/update/{id}")
	public Student updateStudent(@PathVariable int id){
		Student stu1=studentrepository.findById(id).get();
		stu1.setName("Mounika");
		stu1.setPercentage(88);
		stu1.setGrade("A");
		studentrepository.save(stu1);
		return stu1;
	}

	@DeleteMapping("/students/delete/{id}")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void deleteStudent(@PathVariable int id){
		studentrepository.deleteById(id);
		//Student stu=studentrepository.findById(id).get();
		//studentrepository.delete(stu);
	}

	//JWT
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Welcome";
	}


}
