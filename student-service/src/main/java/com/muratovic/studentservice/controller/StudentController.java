package com.muratovic.studentservice.controller;

import com.muratovic.studentservice.domain.Student;
import com.muratovic.studentservice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/students")
public class StudentController {

    private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);

    private final StudentService studentService;

    @Autowired
    public StudentController(final StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student)
    {
        LOG.debug("create student...: " + student);
        return studentService.create(student);
    }

    @GetMapping("/{studentId}")
    public Student findStudent(@PathVariable long studentId) {
        return this.studentService.find(studentId);
    }
}
