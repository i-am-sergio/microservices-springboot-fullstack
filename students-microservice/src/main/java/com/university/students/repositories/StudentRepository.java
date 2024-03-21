package com.university.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.students.models.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long>{
    
}
