package com.zju.gcs.vo;

import lombok.Data;

import java.util.Date;

@Data
public class AddPatientVO {
    private Integer id;
    private String name;
    private Date birthday;
    private Byte gender;
    private Double weight;
    private Double height;
    private String department;
    private Integer doctorId;
    private String chief;
    private String medicalHistory;
    private String opinion;
    private Integer dieseaseId;
}
