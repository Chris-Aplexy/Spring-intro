package com.studentAp.studentAp.controller;

import com.studentAp.studentAp.model.Student;
import com.studentAp.studentAp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping
    public Student add(@RequestBody Student student){
        return service.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return service.getStudentById(id);
    }

    @GetMapping("/allstudents")
    public Student getall(){
        return getall();
    }

    @GetMapping("/{firstname}")
    public Student  getByName(@RequestParam String firstname){
        return service.getByFirstname(firstname);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable String id){
        service.deleteById(id);
        return "Successfully deleted student "+id;
    }

}
