package com.online.school.resource;

import com.online.school.constant.CoreConstant;
import com.online.school.entity.Class;
import com.online.school.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClassResource{

    @Autowired
    private ClassService classService;

    @GetMapping
    public List<Class> findAll(){
        return classService.findAll();
    }

    @PostMapping
    public Class persist(@RequestBody final Class aClass){
        return classService.save(aClass);
    }

    @DeleteMapping
    public String delete(@RequestParam final long id){
        try {
            classService.delete(id);
        }catch (Exception e){
            return CoreConstant.Fail;
        }
        return CoreConstant.SUCCESS;
    }

}
