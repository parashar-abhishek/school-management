package com.school.management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.entity.Student;
import com.school.management.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save_all_students_from_csv")
	public Iterable<Student> createUser() {
		return studentService.save_all_students_from_csv();
	}

	@GetMapping("/get_all_students")
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/get_student_by_id")
	public Student getStudent(@RequestParam Long studentId) {
		return studentService.getStudentById(studentId);
	}
	
	@GetMapping("/get_all_classes")
	public ArrayList<String> getAllClasses(){
		return studentService.getAllClasses();
	}

}
