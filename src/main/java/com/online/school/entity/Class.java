package com.online.school.entity;

import com.online.school.dto.ClassDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Class {
    @Id
    @GeneratedValue(generator = "id_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "id_seq", sequenceName = "id_seq",allocationSize=1)
    private Long Id;
    private String name;
    private String section;

    public Class(ClassDto classDto) {
        Id = classDto.getId();
        this.name = classDto.getName();
        this.section = classDto.getSection();
    }
}
