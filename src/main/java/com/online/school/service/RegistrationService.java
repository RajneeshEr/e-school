package com.online.school.service;

import com.online.school.entity.Registration;

import java.util.List;

public interface RegistrationService {
    List<Registration> findAll();
    Registration save(Registration registration);
    List<Registration> findByFirstnameLike(final String fname);
    List<Registration> findByFirstnameContaining(final String fname);
    void delete(Long id);
}
