package com.ilkayaltinisik.services.impl;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByID(Integer id) {

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override

    public Boolean deleteUser(Integer id) {
        if (id == null) {
            return false;
        }
        studentRepository.deleteById(id);
        return true;

    }
}
