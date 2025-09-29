package com.school.management.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "exam_marks")   // explicitly map to DB table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ExamMarks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_marks_id")
    private Integer examMarksId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "class_id")
    private Integer classId;

    @Column(name = "exam_id")
    private Integer examId;

    @Column(name = "section_id")
    private Integer sectionId;

    @Column(name = "subject_id")
    private Integer subjectId;

    @Column(name = "marks_obtained")
    private Float marksObtained;

    @Column(name = "grade")
    private String grade;
}
