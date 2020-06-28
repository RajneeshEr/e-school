package com.online.school.repository;

import com.online.school.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long> {
    List<Registration> findByFirstNameLike(final String fname);
    List<Registration> findByFirstNameContaining(final String fname);
}
