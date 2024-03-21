package com.university.students.services;

import java.util.List;

import com.university.students.models.StudentModel;

public interface IStudentService {
    
    public List<StudentModel> getStudents();

    public StudentModel getStudentById(Long id);

    public StudentModel saveStudent(StudentModel student);

    public boolean updateStudent(Long id, StudentModel student);

    public boolean deleteStudent(Long id);

}
