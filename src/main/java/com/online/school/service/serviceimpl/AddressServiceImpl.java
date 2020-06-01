package com.online.school.service.serviceimpl;

import com.online.school.dto.AddressDto;
import com.online.school.entity.Address;
import com.online.school.repository.AddressRepo;
import com.online.school.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address save(AddressDto dto) {
        Address address1 = new Address(dto);
        //AddressDto addressDto= ne AddressDto(address);
        final Address save = addressRepo.save(address1);
        return save;
    }

    @Override
    public void delete(Long id) {
        addressRepo.deleteById(id);
    }
}
