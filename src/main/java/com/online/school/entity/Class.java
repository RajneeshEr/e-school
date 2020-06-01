package com.online.school.entity;

import com.online.school.dto.ClassDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String section;

    public Class(ClassDto classDto) {
        Id = classDto.getId();
        this.name = classDto.getName();
        this.section = classDto.getSection();
    }
}
