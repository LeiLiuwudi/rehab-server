package com.zju.gcs.vo;

import lombok.Data;

@Data
public class GetPatientVO {
    private Integer patientId;
    private String patientName;
    private Integer doctorId;
    private String doctorName;
    private Integer diseaseId;
}
