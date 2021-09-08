package com.example.demospringweb.controller;

import com.example.demospringweb.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/param")
public class PassingParamsController {
    @GetMapping("/{name}")
    public String passPathVariable(@PathVariable String name){
        return "Name: " + name;
    }

    @GetMapping
    public String passRequestParam(@RequestParam(required = false) String id, @RequestParam(required = false) String name){
        return "Id: " + id + " - Name: " + name;
    }

    @PostMapping
    public Department passRequestBody(@RequestBody Department dept){
        return dept;
    }


}
