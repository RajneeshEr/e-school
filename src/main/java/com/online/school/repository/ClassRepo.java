package com.online.school.repository;

import com.online.school.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<Class, Long> {
}
