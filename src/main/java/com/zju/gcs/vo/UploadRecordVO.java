package com.zju.gcs.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class UploadRecordVO {
    private Integer patientId;
    private String name;
    private Byte gender;
    private Date birthday;
    private Double height;
    private Double weight;
    private String department;
    private Integer doctorId;
    private Date createdAt;
    private String chief;
    private String presentHistory;
    private String pastHistory;
    private Integer diseaseId;
    private MultipartFile infraFile;
    private String infraDesc;
    private String infraExcp;
    private String opinion;
    private String treat;
    private String treatDetail;
}
