package com.zju.gcs.model;

import java.util.Date;

public class RecordDO {
    private Integer id;

    private Date createdAt;

    private Integer patientId;

    private String chief;

    private String presentHistory;

    private String pastHistory;

    private Integer diseaseId;

    private String infraPath;

    private String infraDesc;

    private String infraExcp;

    private String opinion;

    private String treat;

    private String treatDetail;

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

    public String getPresentHistory() {
        return presentHistory;
    }

    public void setPresentHistory(String presentHistory) {
        this.presentHistory = presentHistory == null ? null : presentHistory.trim();
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory == null ? null : pastHistory.trim();
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getInfraPath() {
        return infraPath;
    }

    public void setInfraPath(String infraPath) {
        this.infraPath = infraPath == null ? null : infraPath.trim();
    }

    public String getInfraDesc() {
        return infraDesc;
    }

    public void setInfraDesc(String infraDesc) {
        this.infraDesc = infraDesc == null ? null : infraDesc.trim();
    }

    public String getInfraExcp() {
        return infraExcp;
    }

    public void setInfraExcp(String infraExcp) {
        this.infraExcp = infraExcp == null ? null : infraExcp.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
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
}