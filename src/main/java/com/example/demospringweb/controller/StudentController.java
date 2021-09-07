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

    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void add(@RequestBody Student s){
        studentService.addStudent(s);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student getAStudent(@PathVariable Integer id){
        return studentService.getAStudent(id);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public void updateStudent(@PathVariable Integer id, @RequestBody Student s){
        studentService.updateStudent(id,s);
    }


}
