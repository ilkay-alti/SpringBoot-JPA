package com.ilkayaltinisik.services;

import java.util.List;

import com.ilkayaltinisik.entites.Student;

public interface IStudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentByID(Integer id);

    public Boolean deleteUser(Integer id);

}
