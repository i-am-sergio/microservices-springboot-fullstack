package com.university.students.repositories;

import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.university.students.models.StudentModel;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<StudentModel, Long>{

    public List<StudentModel> findByAdmissionYear(Date year);
    
}
