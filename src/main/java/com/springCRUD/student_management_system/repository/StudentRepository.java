package com.springCRUD.student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springCRUD.student_management_system.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
