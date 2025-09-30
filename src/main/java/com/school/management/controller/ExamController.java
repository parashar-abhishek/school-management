package com.school.management.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.management.entity.ExamMarks;
import com.school.management.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamService examService;

	@GetMapping("/get_Term_vise_class_students_marks")
	public ArrayList<ExamMarks> getTermClassStudentsMarks(@RequestParam Integer classId, @RequestParam Integer examId,
			@RequestParam Integer sectionId, @RequestParam Integer subjectId) {
		return examService.getTermClassStudentsMarks(classId, examId, sectionId, subjectId);
	}
}
