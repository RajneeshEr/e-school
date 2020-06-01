package com.online.school.dto;


import com.online.school.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
    private Long Id;
    private String firstLine;
    private String secondLine;
    private String pinCode;
    private String landMark;


    public AddressDto(Address addr) {
        this.Id=addr.getId();
        this.firstLine=addr.getFirstLine();
        this.secondLine=addr.getSecondLine();
        this.pinCode=addr.getPinCode();
        this.landMark=addr.getLandMark();
    }
}
