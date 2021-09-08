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

    @PostMapping("/depts")
    public void addDept(@RequestBody Department dept){
        departmentService.addDept(dept);
    }

    @GetMapping("/depts/{id}")
    public Department getOneDept(@PathVariable Integer id){
        return departmentService.getOneDept(id);
    }

    @DeleteMapping("/depts/{id}")
    public void deleteDept(@PathVariable Integer id){
        departmentService.deleteDept(id);
    }

    @PutMapping("/depts/{id}")
    public void updateDept(@PathVariable Integer id, @RequestBody Department dept){
        departmentService.updateDept(id, dept);
    }
}
