package com.muratovic.studentservice.service;

import com.muratovic.studentservice.domain.Student;

import javax.persistence.EntityNotFoundException;

public interface StudentService {

    Student find(Long studentId) throws EntityNotFoundException;

    Student create(Student student);


}
