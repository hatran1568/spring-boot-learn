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

    public void addDept(Department dept){
        departmentRepository.save(dept);
    }

    public Department getOneDept(Integer id){
        return departmentRepository.findById(id).get();
    }

    public void deleteDept(Integer id){
        departmentRepository.deleteById(id);
    }

    public void updateDept(Integer id, Department dept){
        departmentRepository.save(dept);
    }
}
