package com.example.demospringweb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<Student>(Arrays.asList(new Student(1,"a"),
                                            new Student(2,"b"),
                                            new Student(3,"c")));

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public Student getAStudent(int id){
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
    }

    public void deleteStudent(int id){
        students.removeIf(s -> s.getId() == id);
    }

    public void updateStudent(int id, Student s){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id){
                students.set(i, s);
                return;
            }
        }
    }
}
