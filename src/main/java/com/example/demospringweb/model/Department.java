package com.example.demospringweb.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    private String id;

    private String name;
    private String foundingYear;

    public Department() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(String foundingYear) {
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
