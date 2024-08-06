package com.example.backendcrud.controller;

import com.example.backendcrud.entity.Student;
import com.example.backendcrud.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController{

    @Autowired
    private studentRepository studentRepository;

    @GetMapping("/getAllPost")
    public List<Student>getAllPost(){
        System.out.println();
        return null;
    }

    //@PostMapping("/addPost")
   // public Student saveStudent(@RequestBody Student student)
}
