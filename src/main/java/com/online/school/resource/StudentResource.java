package com.online.school.resource;

import com.online.school.entity.Student;
import com.online.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentResource {

    @Autowired
    private StudentService studentService;

    @GetMapping("/rest/api/std/findall")
    public List<Student> getAll(){
        return studentService.findAll();
    }

    @PostMapping("/rest/api/std/persist")
    public Student persist(@RequestBody final Student student){
        return studentService.save(student);
    }

    @GetMapping("/rest/api/std/search/{firstName}")
    public List<Student> searchByFirstName(@PathVariable("firstName") final String fname){
        return studentService.findByFirstnameLike(fname);
    }

    @GetMapping("/rest/api/std/search/firstNameLike")
    public List<Student> searchByFirstNameLike(@RequestParam(value = "name") final String name){
        return studentService.findByFirstnameContaining(name);
    }
}
