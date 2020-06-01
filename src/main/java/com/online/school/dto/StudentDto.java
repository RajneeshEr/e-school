package com.online.school.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long Id;
    private String rollNumber;
    private String firstName;
    private String lastName;
    private String sex;
    private String fatherName;
    private String motherName;
    private String email;
    private Boolean status;             // active- true/false
    private String age;
    private Date dob;                   // Date of birth
    private Date doa;                   // Date of Admission
    private Long classId;               // class foreign key
    private Long addrId;                // Address foreign key
}
