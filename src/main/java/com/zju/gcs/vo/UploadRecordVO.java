package com.zju.gcs.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class UploadRecordVO {
    private Integer patientId;
    private Date createdAt;
    private String chief;
    private String medicalHistory;
    private MultipartFile infraBeforeFile;
    private MultipartFile infraAfterFile;
    private String infraBeforeDesc;
    private String infraAfterDesc;
    private String infraBeforeExcp;
    private String infraAfterExcp;
    private String medicationBefore;
    private String medicationAfter;
    private Date timeBefore;
    private Date timeAfter;
    private Date timeMiddle;
    private String treat;
    private String treatDetail;
}
