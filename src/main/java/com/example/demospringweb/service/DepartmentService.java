package com.example.demospringweb.service;

import com.example.demospringweb.model.Department;
import com.example.demospringweb.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getDepts(){
        return departmentRepository.findAll();
    }

    public void add(Department dept){
        departmentRepository.save(dept);
    }

    public Department getById(String id){
        return departmentRepository.getById(id);
    }

    public void deleteById(String id){
        Department d = departmentRepository.getById(id);
        departmentRepository.delete(d);
    }

    public void updateById(String id, Department dept){
        departmentRepository.save(dept);
    }
}
