package com.online.school.service;

import com.online.school.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address save(Address address);
    void delete(Long id);
}
