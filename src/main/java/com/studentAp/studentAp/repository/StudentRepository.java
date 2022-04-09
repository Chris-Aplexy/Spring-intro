package com.studentAp.studentAp.repository;

import com.studentAp.studentAp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{


    Student getByFirstname(String firstname);
}
