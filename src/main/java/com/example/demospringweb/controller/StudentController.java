package com.example.demospringweb.controller;

import com.example.demospringweb.service.StudentService;
import com.example.demospringweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public void add(@RequestBody Student s){
        studentService.add(s);
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable Integer id){
        return studentService.getById(id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteById(@PathVariable Integer id){
        studentService.deleteById(id);
    }

    @PutMapping("/students/{id}")
    public void updateById(@PathVariable Integer id, @RequestBody Student s){
        studentService.updateById(id,s);
    }


}
