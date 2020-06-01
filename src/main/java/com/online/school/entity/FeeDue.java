package com.online.school.entity;


import com.online.school.dto.FeeDueDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FeeDue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @NotEmpty(message = "Student details should not be null...")
    private Long studentId;
    @NotEmpty(message = "Student class details should not be null...")
    private Long classId;
    private String session;             // 2019-2020
    private String typeOfFee;           // course, bus, tuition,

    private Long amount;
    private Long total;
    private Long advance;
    private Long pending;

    private Date paidDate;

    public FeeDue(FeeDueDto feeDueDto) {
        Id = feeDueDto.getId();
        this.studentId = feeDueDto.getStudentId();
        this.classId = feeDueDto.getClassId();
        this.session = feeDueDto.getSession();
        this.typeOfFee = feeDueDto.getTypeOfFee();
        this.amount = feeDueDto.getAmount();
        this.total = feeDueDto.getTotal();
        this.advance = feeDueDto.getAdvance();
        this.pending = feeDueDto.getPending();
        this.paidDate = feeDueDto.getPaidDate();
    }


}
