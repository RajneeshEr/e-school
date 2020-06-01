package com.online.school.dto;

import com.online.school.entity.FeeDue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeeDueDto {

    private Long Id;
    private Long studentId;
    private Long classId;
    private String session;             // 2019-2020
    private String typeOfFee;           // course, bus, tuition,

    private Long amount;
    private Long total;
    private Long advance;
    private Long pending;

    private Date paidDate;

    public FeeDueDto(FeeDue feeDue) {
        this.Id = feeDue.getId();
        this.studentId = feeDue.getStudentId();
        this.classId = feeDue.getClassId();
        this.session = feeDue.getSession();
        this.typeOfFee = feeDue.getTypeOfFee();
        this.amount = feeDue.getAmount();
        this.total = feeDue.getTotal();
        this.advance = feeDue.getAdvance();
        this.pending = feeDue.getPending();
        this.paidDate = feeDue.getPaidDate();
    }
}
