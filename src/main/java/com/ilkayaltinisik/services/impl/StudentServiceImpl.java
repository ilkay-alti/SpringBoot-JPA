package com.ilkayaltinisik.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilkayaltinisik.entites.Student;
import com.ilkayaltinisik.repository.StudentRepository;
import com.ilkayaltinisik.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
