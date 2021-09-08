package com.example.demospringweb.service;

import com.example.demospringweb.model.Student;
import com.example.demospringweb.repository.DepartmentRepository;
import com.example.demospringweb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addStudent(Student s){

        studentRepository.save(s);

    }

    public Student getAStudent(Integer id){
        return studentRepository.findById(id).get();
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }

    public void updateStudent(Integer id, Student s){
        studentRepository.save(s);
    }
}
