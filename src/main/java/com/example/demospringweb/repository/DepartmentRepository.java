package com.example.demospringweb.repository;

import com.example.demospringweb.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query(value = "select d from Department d where d.id = ?1")
    Department getById(String id);

}
