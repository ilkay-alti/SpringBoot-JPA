package com.ilkayaltinisik.controller;

import java.util.List;

import com.ilkayaltinisik.entites.Student;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(Integer id);

    public Boolean deleteUser(Integer id);
}
