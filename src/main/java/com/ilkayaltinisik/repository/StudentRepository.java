package com.ilkayaltinisik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ilkayaltinisik.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
