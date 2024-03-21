package com.university.students.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.university.students.models.StudentModel;
import com.university.students.repositories.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements IStudentService {
    
    private final StudentRepository studentRepository;

    @Override
    public List<StudentModel> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public StudentModel getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public StudentModel saveStudent(StudentModel student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean updateStudent(Long id, StudentModel student) {
        if (studentRepository.existsById(id)) {
            studentRepository.save(student);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}
