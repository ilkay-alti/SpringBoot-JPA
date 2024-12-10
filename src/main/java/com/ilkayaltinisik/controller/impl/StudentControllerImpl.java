package com.ilkayaltinisik.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ilkayaltinisik.controller.IStudentController;
import com.ilkayaltinisik.entites.Student;
import com.ilkayaltinisik.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    @Override
    public Student getStudentById(@PathVariable(name = "id", required = true) Integer id) {
        return studentService.getStudentByID(id);
    }

    @DeleteMapping("/{id}")
    @Override
    public Boolean deleteUser(@PathVariable(name = "id", required = true) Integer id) {
        return studentService.deleteUser(id);
    }

}
