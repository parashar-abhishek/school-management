package com.school.management.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.entity.Student;
import com.school.management.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Iterable<Student> save_all_students_from_csv() {

		Test test = new Test();

		return studentRepository.saveAll(test.getstudents_from_pdf());
	}
	
	public Iterable<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	public ArrayList<String> getAllClasses() {
		ArrayList<String> allClasses = studentRepository.findDistinctStudentClasses();
		return allClasses;
	}

	public Student getStudentById(Long studentId) {
//		Student student = studentRepository.findAllById(studentId);
		// TODO Auto-generated method stub
		return studentRepository.findByStudentId(studentId);
	}

}