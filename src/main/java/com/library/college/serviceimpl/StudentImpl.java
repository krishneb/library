package com.library.college.serviceimpl;

import com.library.college.dto.Student;
import com.library.college.service.StudentInt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentImpl implements StudentInt {

    @Override
    public Boolean createStudent(Student student) {
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(student);
        return true;
    }
}
