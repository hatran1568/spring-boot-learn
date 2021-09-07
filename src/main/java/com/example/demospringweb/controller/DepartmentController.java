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

    @RequestMapping("/depts")
    public List<Department> getDepts(){
        return departmentService.getDepts();
    }

    @RequestMapping(value = "/depts", method = RequestMethod.POST)
    public void addDept(@RequestBody Department dept){
        departmentService.addDept(dept);
    }

    @RequestMapping(value = "/depts/{id}", method = RequestMethod.GET)
    public Department getOneDept(@PathVariable Integer id){
        return departmentService.getOneDept(id);
    }

    @RequestMapping(value = "/depts/{id}", method = RequestMethod.DELETE)
    public void deleteDept(@PathVariable Integer id){
        departmentService.deleteDept(id);
    }

    @RequestMapping(value = "/depts/{id}", method = RequestMethod.PUT)
    public void updateDept(@PathVariable Integer id, @RequestBody Department dept){
        departmentService.updateDept(id, dept);
    }
}
