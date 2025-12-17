package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

// import java.util.HashMap;
// import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

// import com.example.demo.entity.Student;


@Service
public class StudentService {

    // Map<Integer,Student>data=new HashMap<>();

    // public Student createData(Student stu) {
    //     data.put(stu.getId(),stu);
    //     return stu;
    // }
    @Autowired
    StudentRepository repo;

    //create (or) Insert data
    public Student createData(Student stu){
        return repo.save(stu);
    }

    //Fetch all records
    public List<Student>fetchRecord(){
        return repo.findAll();
    }

}