package com.online.school.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
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
