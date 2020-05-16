package com.online.school.repository;

import com.online.school.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudenRepo extends JpaRepository<Student,Long> {
    List<Student> findByFirstNameLike(final String fname);
    List<Student> findByFirstNameContaining(final String fname);
}
