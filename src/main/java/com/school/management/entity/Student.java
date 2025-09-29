package com.school.management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity(name = "students")
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

//    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "enrollment_date")
    private Date enrollmentDate;

    @Column(name = "class_id")
    private Integer classId;
    
    @Column(name = "student_class")
    private String student_class;

    @Column(name = "section")
    private String section;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "social_category")
    private String socialCategory;

    @Column(name = "minority_group")
    private String minorityGroup;

    @Column(name = "aadhaar_no")
    private String aadhaarNo;

    @Column(name = "name_as_per_aadhaar")
    private String nameAsPerAadhaar;

//    public enum Gender {
//        Male, Female
//    }
}
