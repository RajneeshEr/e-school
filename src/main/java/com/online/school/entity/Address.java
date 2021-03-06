package com.online.school.entity;

import com.online.school.dto.AddressDto;
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
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String firstLine;
    private String secondLine;
    private String pinCode;
    private String landMark;

    public Address(AddressDto dto) {
        this.Id=dto.getId();
        this.firstLine=dto.getFirstLine();
        this.secondLine=dto.getSecondLine();
        this.pinCode=dto.getPinCode();
        this.landMark=dto.getLandMark();
    }
}
