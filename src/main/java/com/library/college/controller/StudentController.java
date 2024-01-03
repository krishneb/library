package com.library.college.controller;

import com.library.college.dto.Student;
import com.library.college.service.StudentInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentInt studentInt;

    @PostMapping
    public Boolean createStudent(@RequestBody Student student) {
        Boolean value = studentInt.createStudent(student);
        return value;
    }

    @GetMapping
    public List<Student> getStudent(@PathVariable String name) {
        /*List<Student> getStudent = */
        return new ArrayList<>();
    }
}
