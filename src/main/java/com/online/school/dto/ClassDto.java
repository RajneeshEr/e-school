package com.online.school.dto;

import com.online.school.entity.Class;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassDto {
    private Long Id;
    private String name;
    private String section;

    public ClassDto(Class aClass) {
        Id = aClass.getId();
        this.name = aClass.getName();
        this.section = aClass.getSection();
    }

}
