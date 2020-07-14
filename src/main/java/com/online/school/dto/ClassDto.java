package com.online.school.dto;

import com.online.school.entity.Class;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassDto implements Serializable {
    private Long Id;
    private String name;
    private String section;

    public ClassDto(Class aClass) {
        Id = aClass.getId();
        this.name = aClass.getName();
        this.section = aClass.getSection();
    }

}
