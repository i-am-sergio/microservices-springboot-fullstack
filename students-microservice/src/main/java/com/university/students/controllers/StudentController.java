package com.university.students.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.students.models.StudentModel;
import com.university.students.services.IStudentService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final IStudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentModel>> getStudents() {
        try {
            return ResponseEntity.ok(studentService.getStudents());
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(studentService.getStudentById(id));
        } catch (Exception e) {
            return ResponseEntity.status(404).build();
        }
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody StudentModel entity) {
        try {
            StudentModel newStudent = studentService.saveStudent(entity);
            if (newStudent != null) {
                return ResponseEntity.status(201).build();
            } else {
                return ResponseEntity.status(400).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable("id") Long id, @RequestBody StudentModel entity) {
        try {
            if (studentService.updateStudent(id, entity)) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Student updated");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating student");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id) {
        try {
            if (studentService.deleteStudent(id)) {
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Student deleted");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting student");
        }
    }

    // To fix
    @GetMapping("/admissionYear/{year}")
    public ResponseEntity<List<StudentModel>> getStudentsByAdmissionYear(@PathVariable("year") Date admissionYear) {
        try {
            return ResponseEntity.ok(studentService.getStudentsByAdmissionYear(admissionYear));
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

}
