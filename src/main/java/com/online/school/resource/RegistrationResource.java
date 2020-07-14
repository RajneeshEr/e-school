package com.online.school.resource;

import com.online.school.entity.Registration;
import com.online.school.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class RegistrationResource {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/rest/api/registration/findall")
    public List<Registration> getAll(){
        return registrationService.findAll();
    }

    @PostMapping("/rest/api/registration/persist")
    public Registration persist(@RequestBody final Registration registration){
        return registrationService.save(registration);
    }

    @GetMapping("/rest/api/registration/search/{firstName}")
    public List<Registration> searchByFirstName(@PathVariable("firstName") final String fname){
        return registrationService.findByFirstnameLike(fname);
    }

    @GetMapping("/rest/api/registration/search/firstNameLike")
    public List<Registration> searchByFirstNameLike(@RequestParam(value = "name") final String name){
        return registrationService.findByFirstnameContaining(name);
    }
}
