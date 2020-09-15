package com.zju.gcs.model;

import java.util.Date;

public class RecordDO {
    private Integer id;

    private Date createdAt;

    private Integer patientId;

    private String chief;

    private String medicalHistory;

    private String infraBeforePath;

    private String infraAfterPath;

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
        this.chief = chief == null ? null : chief.trim();
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory == null ? null : medicalHistory.trim();
    }

    public String getInfraBeforePath() {
        return infraBeforePath;
    }

    public void setInfraBeforePath(String infraBeforePath) {
        this.infraBeforePath = infraBeforePath == null ? null : infraBeforePath.trim();
    }

    public String getInfraAfterPath() {
        return infraAfterPath;
    }

    public void setInfraAfterPath(String infraAfterPath) {
        this.infraAfterPath = infraAfterPath == null ? null : infraAfterPath.trim();
    }

    public String getInfraBeforeDesc() {
        return infraBeforeDesc;
    }

    public void setInfraBeforeDesc(String infraBeforeDesc) {
        this.infraBeforeDesc = infraBeforeDesc == null ? null : infraBeforeDesc.trim();
    }

    public String getInfraAfterDesc() {
        return infraAfterDesc;
    }

    public void setInfraAfterDesc(String infraAfterDesc) {
        this.infraAfterDesc = infraAfterDesc == null ? null : infraAfterDesc.trim();
    }

    public String getInfraBeforeExcp() {
        return infraBeforeExcp;
    }

    public void setInfraBeforeExcp(String infraBeforeExcp) {
        this.infraBeforeExcp = infraBeforeExcp == null ? null : infraBeforeExcp.trim();
    }

    public String getInfraAfterExcp() {
        return infraAfterExcp;
    }

    public void setInfraAfterExcp(String infraAfterExcp) {
        this.infraAfterExcp = infraAfterExcp == null ? null : infraAfterExcp.trim();
    }

    public String getMedicationBefore() {
        return medicationBefore;
    }

    public void setMedicationBefore(String medicationBefore) {
        this.medicationBefore = medicationBefore == null ? null : medicationBefore.trim();
    }

    public String getMedicationAfter() {
        return medicationAfter;
    }

    public void setMedicationAfter(String medicationAfter) {
        this.medicationAfter = medicationAfter == null ? null : medicationAfter.trim();
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
        this.treat = treat == null ? null : treat.trim();
    }

    public String getTreatDetail() {
        return treatDetail;
    }

    public void setTreatDetail(String treatDetail) {
        this.treatDetail = treatDetail == null ? null : treatDetail.trim();
    }

    public Integer getTreatCount() {
        return treatCount;
    }

    public void setTreatCount(Integer treatCount) {
        this.treatCount = treatCount;
    }
}