package com.online.school.service;

import com.online.school.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
    List<Student> findByFirstnameLike(final String fname);
    List<Student> findByFirstnameContaining(final String fname);
    void delete(Long id);
}