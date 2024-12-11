package com.ilkayaltinisik.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilkayaltinisik.dto.DtoStudent;
import com.ilkayaltinisik.dto.DtoStudentIU;
import com.ilkayaltinisik.entites.Student;
import com.ilkayaltinisik.repository.StudentRepository;
import com.ilkayaltinisik.services.IStudentService;

import jakarta.validation.Valid;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(@Valid DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();

        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbSutudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbSutudent, response);

        return response;

    }

    @Override
    public List<DtoStudent> getAllStudent() {
        List<DtoStudent> response = new ArrayList<>();

        List<Student> studentList = studentRepository.findAll();

        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            response.add(dto);
        }

        return response;
    }

    @Override
    public DtoStudent getStudentByID(Integer id) {

        DtoStudent dto = new DtoStudent();

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {
            Student dbStudent = optional.get();
            BeanUtils.copyProperties(dbStudent, dto);
            return dto;
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

    @Override
    public DtoStudent updateStudent(Integer id, @Valid DtoStudentIU dtoStudentIU) {

        DtoStudent dto = new DtoStudent();

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {
            Student dbStudent = optional.get();
            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());

            Student updateStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updateStudent, dto);

            return dto;
        }

        return null;
    }

}
