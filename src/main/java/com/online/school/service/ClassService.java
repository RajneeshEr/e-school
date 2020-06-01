package com.online.school.service;

import com.online.school.entity.Class;

import java.util.List;

public interface ClassService {
    List<Class> findAll();
    Class save(Class student);
    void delete(Long id);
}
