package com.school.management.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.school.management.entity.ExamMarks;

@Repository
public interface ExamMarksRepository extends JpaRepository<ExamMarks, Long>{

	@Query(value = """
		    SELECT * 
		    FROM exam_marks em
		    WHERE em.class_id = :classId
		      AND em.exam_id = :examId
		      AND em.section_id = :sectionId
		      AND em.subject_id = :subjectId
		    """, nativeQuery = true)
		ArrayList<ExamMarks> getTermClassStudentsMarks(@Param("classId") Integer classId,
		                                               @Param("examId") Integer examId,
		                                               @Param("sectionId") Integer sectionId,
		                                               @Param("subjectId") Integer subjectId);

}
