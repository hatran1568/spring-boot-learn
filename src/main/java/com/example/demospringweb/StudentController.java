package com.example.demospringweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(method = RequestMethod.POST, value = "/students/add")
    public void add(@RequestBody Student s){
        studentService.addStudent(s);
    }

    @RequestMapping("/students/{id}")
    public Student getAStudent(@PathVariable int id){
        return studentService.getAStudent(id);
    }

    @RequestMapping("/students/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

    @RequestMapping(value = "/students/update/{id}", method = RequestMethod.PUT)
    public void updateStudent(@PathVariable int id, @RequestBody Student s){
        studentService.updateStudent(id,s);
    }


}
