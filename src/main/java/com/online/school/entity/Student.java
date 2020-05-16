package com.online.school.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String firstName;
    private String lastName;
    private String sex;
    private String fatherName;
    private String motherName;
    private String email;
    private Boolean status; // active- true/false
    private String age;
    private Long addrId;

}
