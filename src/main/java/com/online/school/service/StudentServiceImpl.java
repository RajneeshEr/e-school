package com.online.school.service;

import com.online.school.entity.Student;
import com.online.school.repository.StudenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudenRepo studenRepo;

    @Override
    public List<Student> findAll() {
        return studenRepo.findAll();
    }

    @Override
    public Student save(Student student) {
        return studenRepo.save(student);
    }

    @Override
    public List<Student> findByFirstnameLike(final String fname) {
        return studenRepo.findByFirstNameLike(fname);
    }

    @Override
    public List<Student> findByFirstnameContaining(final String fname) {
        return studenRepo.findByFirstNameContaining(fname);
    }

    @Override
    public void delete(Long id) {
        studenRepo.deleteById(id);
    }

}
