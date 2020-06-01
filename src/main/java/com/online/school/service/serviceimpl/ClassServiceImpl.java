package com.online.school.service.serviceimpl;

import com.online.school.entity.Class;
import com.online.school.repository.ClassRepo;
import com.online.school.resource.ClassResource;
import com.online.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassRepo classRepo;

    @Override
    public List<Class> findAll() {
        return classRepo.findAll();
    }

    @Override
    public Class save(Class aClass) {
        return classRepo.save(aClass);
    }

    @Override
    public void delete(Long id) {
        classRepo.deleteById(id);
    }
}
