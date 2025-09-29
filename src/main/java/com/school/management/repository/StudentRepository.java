package com.school.management.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.school.management.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Student findByStudentId(Long studentId);

	@Query("SELECT DISTINCT s.student_class as student_class FROM students s WHERE s.student_class IS NOT NULL")
	ArrayList<String> findDistinctStudentClasses();
	

}