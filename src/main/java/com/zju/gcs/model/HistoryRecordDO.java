package com.zju.gcs.model;

import java.util.Date;

public class HistoryRecordDO {
    private Integer id;

    private Date createdAt;

    private Integer patientId;

    private String chief;

    private String medicalHistory;

    private String infraBeforePath;

    private String infraAfterPath;

    private String infraBeforeTxtPath;

    private String infraAfterTxtPath;

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

    private Integer treatCount;

    private String neckAreaBefore;

    private String neckAreaAfter;

    private Integer classificationBefore;

    private Integer classificationAfter;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInfraBeforePath() {
        return infraBeforePath;
    }

    public void setInfraBeforePath(String infraBeforePath) {
        this.infraBeforePath = infraBeforePath;
    }

    public String getInfraAfterPath() {
        return infraAfterPath;
    }

    public void setInfraAfterPath(String infraAfterPath) {
        this.infraAfterPath = infraAfterPath;
    }

    public String getInfraBeforeTxtPath() {
        return infraBeforeTxtPath;
    }

    public void setInfraBeforeTxtPath(String infraBeforeTxtPath) {
        this.infraBeforeTxtPath = infraBeforeTxtPath;
    }

    public String getInfraAfterTxtPath() {
        return infraAfterTxtPath;
    }

    public void setInfraAfterTxtPath(String infraAfterTxtPath) {
        this.infraAfterTxtPath = infraAfterTxtPath;
    }

    public String getInfraBeforeDesc() {
        return infraBeforeDesc;
    }

    public void setInfraBeforeDesc(String infraBeforeDesc) {
        this.infraBeforeDesc = infraBeforeDesc;
    }

    public String getInfraAfterDesc() {
        return infraAfterDesc;
    }

    public void setInfraAfterDesc(String infraAfterDesc) {
        this.infraAfterDesc = infraAfterDesc;
    }

    public String getInfraBeforeExcp() {
        return infraBeforeExcp;
    }

    public void setInfraBeforeExcp(String infraBeforeExcp) {
        this.infraBeforeExcp = infraBeforeExcp;
    }

    public String getInfraAfterExcp() {
        return infraAfterExcp;
    }

    public void setInfraAfterExcp(String infraAfterExcp) {
        this.infraAfterExcp = infraAfterExcp;
    }

    public String getMedicationBefore() {
        return medicationBefore;
    }

    public void setMedicationBefore(String medicationBefore) {
        this.medicationBefore = medicationBefore;
    }

    public String getMedicationAfter() {
        return medicationAfter;
    }

    public void setMedicationAfter(String medicationAfter) {
        this.medicationAfter = medicationAfter;
    }

    public Date getTimeBefore() {
        return timeBefore;
    }

    public void setTimeBefore(Date timeBefore) {
        this.timeBefore = timeBefore;
    }

    public Date getTimeAfter() {
        return timeAfter;
    }

    public void setTimeAfter(Date timeAfter) {
        this.timeAfter = timeAfter;
    }

    public Date getTimeMiddle() {
        return timeMiddle;
    }

    public void setTimeMiddle(Date timeMiddle) {
        this.timeMiddle = timeMiddle;
    }

    public String getTreat() {
        return treat;
    }

    public void setTreat(String treat) {
        this.treat = treat;
    }

    public String getTreatDetail() {
        return treatDetail;
    }

    public void setTreatDetail(String treatDetail) {
        this.treatDetail = treatDetail;
    }

    public Integer getTreatCount() {
        return treatCount;
    }

    public void setTreatCount(Integer treatCount) {
        this.treatCount = treatCount;
    }

    public String getNeckAreaBefore() {
        return neckAreaBefore;
    }

    public void setNeckAreaBefore(String neckAreaBefore) {
        this.neckAreaBefore = neckAreaBefore;
    }

    public String getNeckAreaAfter() {
        return neckAreaAfter;
    }

    public void setNeckAreaAfter(String neckAreaAfter) {
        this.neckAreaAfter = neckAreaAfter;
    }

    public Integer getClassificationBefore() {
        return classificationBefore;
    }

    public void setClassificationBefore(Integer classificationBefore) {
        this.classificationBefore = classificationBefore;
    }

    public Integer getClassificationAfter() {
        return classificationAfter;
    }

    public void setClassificationAfter(Integer classificationAfter) {
        this.classificationAfter = classificationAfter;
    }
}
