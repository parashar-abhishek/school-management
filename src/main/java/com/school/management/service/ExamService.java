package com.school.management.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.management.entity.ExamMarks;
import com.school.management.repository.ExamMarksRepository;

@Service
public class ExamService {
	
	@Autowired
	private ExamMarksRepository examMarksRepository;
	
	public ArrayList<ExamMarks> getTermClassStudentsMarks(Integer classId, Integer examId, Integer sectionId, Integer subjectId){
		System.out.println(" "+ classId);
		ArrayList<ExamMarks> marks = examMarksRepository.getTermClassStudentsMarks(classId, examId, sectionId, subjectId);
		System.out.println(marks.size());
		for (ExamMarks examMarks : marks) {
			System.out.println(examMarks.getMarksObtained());
		}
		
		
		return marks;
	}

}
