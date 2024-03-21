package com.university.students.services;

import java.util.List;
import java.util.Date;

import org.springframework.beans.BeanUtils;
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
        StudentModel studentToUpdate = studentRepository.findById(id).orElse(null);
        if (studentToUpdate != null) {
            // Copy the new student data to the studentToUpdate object
            BeanUtils.copyProperties(student, studentToUpdate, "id");
            studentRepository.save(studentToUpdate);
            return true; // Se actualizó correctamente
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

    @Override
    public List<StudentModel> getStudentsByAdmissionYear(Date year) {
        return studentRepository.findByAdmissionYear(year);
    }

}
