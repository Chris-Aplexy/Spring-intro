package com.studentAp.studentAp.service;

import com.studentAp.studentAp.model.Student;
import com.studentAp.studentAp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(String id){
        return repository.findById(id).orElse(null);
    }

    public Student getall(){
        return getall();
    }

    public Student  getByFirstname(String firstname){
        return repository.getByFirstname(firstname);
    }

    public String deleteById(String id){
        repository.deleteById(id);
        return "Successfully deleted student "+id;
    }
}
