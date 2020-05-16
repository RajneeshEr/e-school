package com.online.school.resource;

import com.online.school.entity.Address;
import com.online.school.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AddressResource {

    @Autowired
    private AddressService addressService;

    @GetMapping("/rest/api/addr/findall")
    public List<Address> getAll(){
        return addressService.findAll();
    }

    @PostMapping("/rest/api/addr/persist")
    Address persist(@RequestBody final Address address){
        return addressService.save(address);
    }

}
