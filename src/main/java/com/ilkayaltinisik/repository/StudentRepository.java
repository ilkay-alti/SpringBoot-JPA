package com.ilkayaltinisik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ilkayaltinisik.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // nativeQuery False
    // HQL : sınıf ismi ve değişken isimleri kulanılır sorgu yazılırken -
    // nativeQuery True
    // SQL : tablo ve tablo isimelri kullanılır sorgu yazılırken -
    @Query(value = "from Student", nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from student s WHERE s.id= :studentID")
    Student findStudentById(Integer studentID);
}
