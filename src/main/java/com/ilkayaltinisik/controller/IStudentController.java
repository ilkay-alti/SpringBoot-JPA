package com.ilkayaltinisik.controller;

import java.util.List;

import com.ilkayaltinisik.dto.DtoStudent;
import com.ilkayaltinisik.dto.DtoStudentIU;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudent();

    public DtoStudent getStudentById(Integer id);

    public Boolean deleteUser(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
