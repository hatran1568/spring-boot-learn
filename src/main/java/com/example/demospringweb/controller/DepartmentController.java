package com.example.demospringweb.controller;

import com.example.demospringweb.model.Department;
import com.example.demospringweb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/depts")
    public List<Department> getDepts(){
        return departmentService.getDepts();
    }

    //Pass parameter with post request in json format using @RequestBody
    @PostMapping("/depts")
    public void add(@RequestBody Department dept){
        departmentService.add(dept);
    }

    //Pass parameter
    @GetMapping("/depts/{id}")
    public Department getById(@PathVariable String id){
        return departmentService.getById(id);
    }

    @DeleteMapping("/depts/{id}")
    public void deleteById(@PathVariable String id){
        departmentService.deleteById(id);
    }

    @PutMapping("/depts/{id}")
    public void updateDept(@PathVariable String id, @RequestBody Department dept){
        departmentService.updateById(id, dept);
    }
}
