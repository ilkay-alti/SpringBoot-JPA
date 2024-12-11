package com.ilkayaltinisik.services;

import java.util.List;

import com.ilkayaltinisik.dto.DtoStudent;
import com.ilkayaltinisik.dto.DtoStudentIU;
import com.ilkayaltinisik.entites.Student;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudent();

    public DtoStudent getStudentByID(Integer id);

    public Boolean deleteUser(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU updateStudentData);

}
