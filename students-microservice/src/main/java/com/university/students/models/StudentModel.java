package com.university.students.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter 
@Setter
public class StudentModel {

    @Id 
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String email;

    private String phone;
    private String address;
    private String photo;
    private String gender;

    @Column(name = "admission_year")
    private Date admissionYear;
    
    @Column(name = "graduation_year")
    private Date graduationYear;

}
