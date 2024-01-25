package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    // define @PostConstruct to load the student data... only once!

    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("현상", "하"));
        theStudents.add(new Student("미미", "이"));
        theStudents.add(new Student("춘식", "황"));
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {

        // List<Student> theStudents = new ArrayList<>();

        // theStudents.add(new Student("현상", "하"));
        // theStudents.add(new Student("미미", "김"));
        // theStudents.add(new Student("춘식", "황"));

        return theStudents; // automatically converted to JSON
    }

    // define endpoint or "students/{studentId}" - return student at index

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check the studentId against list size
        if ( (studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("studentId not found - " + studentId);
        }

        return theStudents.get(studentId);
    }

    // add an exception handler using @ExceptionHandler

}


