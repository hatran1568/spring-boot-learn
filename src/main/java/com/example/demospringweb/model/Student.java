package com.example.demospringweb.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Boolean gender;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "dept_id", nullable = false)
    private Department dept;

    public Student() {
    }

    public Student(Integer id, String name, Boolean gender, String phone, Department dept) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
