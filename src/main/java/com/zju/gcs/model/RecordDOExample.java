package com.zju.gcs.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("patient_id is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patient_id =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patient_id <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patient_id >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_id >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patient_id <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patient_id <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patient_id in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patient_id not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patient_id between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_id not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andChiefIsNull() {
            addCriterion("chief is null");
            return (Criteria) this;
        }

        public Criteria andChiefIsNotNull() {
            addCriterion("chief is not null");
            return (Criteria) this;
        }

        public Criteria andChiefEqualTo(String value) {
            addCriterion("chief =", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotEqualTo(String value) {
            addCriterion("chief <>", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThan(String value) {
            addCriterion("chief >", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThanOrEqualTo(String value) {
            addCriterion("chief >=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThan(String value) {
            addCriterion("chief <", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThanOrEqualTo(String value) {
            addCriterion("chief <=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLike(String value) {
            addCriterion("chief like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotLike(String value) {
            addCriterion("chief not like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefIn(List<String> values) {
            addCriterion("chief in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotIn(List<String> values) {
            addCriterion("chief not in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefBetween(String value1, String value2) {
            addCriterion("chief between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotBetween(String value1, String value2) {
            addCriterion("chief not between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNull() {
            addCriterion("medical_history is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNotNull() {
            addCriterion("medical_history is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryEqualTo(String value) {
            addCriterion("medical_history =", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotEqualTo(String value) {
            addCriterion("medical_history <>", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThan(String value) {
            addCriterion("medical_history >", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medical_history >=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThan(String value) {
            addCriterion("medical_history <", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("medical_history <=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLike(String value) {
            addCriterion("medical_history like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotLike(String value) {
            addCriterion("medical_history not like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIn(List<String> values) {
            addCriterion("medical_history in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotIn(List<String> values) {
            addCriterion("medical_history not in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryBetween(String value1, String value2) {
            addCriterion("medical_history between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("medical_history not between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathIsNull() {
            addCriterion("infra_before_path is null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathIsNotNull() {
            addCriterion("infra_before_path is not null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathEqualTo(String value) {
            addCriterion("infra_before_path =", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathNotEqualTo(String value) {
            addCriterion("infra_before_path <>", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathGreaterThan(String value) {
            addCriterion("infra_before_path >", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathGreaterThanOrEqualTo(String value) {
            addCriterion("infra_before_path >=", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathLessThan(String value) {
            addCriterion("infra_before_path <", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathLessThanOrEqualTo(String value) {
            addCriterion("infra_before_path <=", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathLike(String value) {
            addCriterion("infra_before_path like", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathNotLike(String value) {
            addCriterion("infra_before_path not like", value, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathIn(List<String> values) {
            addCriterion("infra_before_path in", values, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathNotIn(List<String> values) {
            addCriterion("infra_before_path not in", values, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathBetween(String value1, String value2) {
            addCriterion("infra_before_path between", value1, value2, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforePathNotBetween(String value1, String value2) {
            addCriterion("infra_before_path not between", value1, value2, "infraBeforePath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathIsNull() {
            addCriterion("infra_after_path is null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathIsNotNull() {
            addCriterion("infra_after_path is not null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathEqualTo(String value) {
            addCriterion("infra_after_path =", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathNotEqualTo(String value) {
            addCriterion("infra_after_path <>", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathGreaterThan(String value) {
            addCriterion("infra_after_path >", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathGreaterThanOrEqualTo(String value) {
            addCriterion("infra_after_path >=", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathLessThan(String value) {
            addCriterion("infra_after_path <", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathLessThanOrEqualTo(String value) {
            addCriterion("infra_after_path <=", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathLike(String value) {
            addCriterion("infra_after_path like", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathNotLike(String value) {
            addCriterion("infra_after_path not like", value, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathIn(List<String> values) {
            addCriterion("infra_after_path in", values, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathNotIn(List<String> values) {
            addCriterion("infra_after_path not in", values, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathBetween(String value1, String value2) {
            addCriterion("infra_after_path between", value1, value2, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraAfterPathNotBetween(String value1, String value2) {
            addCriterion("infra_after_path not between", value1, value2, "infraAfterPath");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescIsNull() {
            addCriterion("infra_before_desc is null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescIsNotNull() {
            addCriterion("infra_before_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescEqualTo(String value) {
            addCriterion("infra_before_desc =", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescNotEqualTo(String value) {
            addCriterion("infra_before_desc <>", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescGreaterThan(String value) {
            addCriterion("infra_before_desc >", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescGreaterThanOrEqualTo(String value) {
            addCriterion("infra_before_desc >=", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescLessThan(String value) {
            addCriterion("infra_before_desc <", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescLessThanOrEqualTo(String value) {
            addCriterion("infra_before_desc <=", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescLike(String value) {
            addCriterion("infra_before_desc like", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescNotLike(String value) {
            addCriterion("infra_before_desc not like", value, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescIn(List<String> values) {
            addCriterion("infra_before_desc in", values, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescNotIn(List<String> values) {
            addCriterion("infra_before_desc not in", values, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescBetween(String value1, String value2) {
            addCriterion("infra_before_desc between", value1, value2, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeDescNotBetween(String value1, String value2) {
            addCriterion("infra_before_desc not between", value1, value2, "infraBeforeDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescIsNull() {
            addCriterion("infra_after_desc is null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescIsNotNull() {
            addCriterion("infra_after_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescEqualTo(String value) {
            addCriterion("infra_after_desc =", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescNotEqualTo(String value) {
            addCriterion("infra_after_desc <>", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescGreaterThan(String value) {
            addCriterion("infra_after_desc >", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescGreaterThanOrEqualTo(String value) {
            addCriterion("infra_after_desc >=", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescLessThan(String value) {
            addCriterion("infra_after_desc <", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescLessThanOrEqualTo(String value) {
            addCriterion("infra_after_desc <=", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescLike(String value) {
            addCriterion("infra_after_desc like", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescNotLike(String value) {
            addCriterion("infra_after_desc not like", value, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescIn(List<String> values) {
            addCriterion("infra_after_desc in", values, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescNotIn(List<String> values) {
            addCriterion("infra_after_desc not in", values, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescBetween(String value1, String value2) {
            addCriterion("infra_after_desc between", value1, value2, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraAfterDescNotBetween(String value1, String value2) {
            addCriterion("infra_after_desc not between", value1, value2, "infraAfterDesc");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpIsNull() {
            addCriterion("infra_before_excp is null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpIsNotNull() {
            addCriterion("infra_before_excp is not null");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpEqualTo(String value) {
            addCriterion("infra_before_excp =", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpNotEqualTo(String value) {
            addCriterion("infra_before_excp <>", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpGreaterThan(String value) {
            addCriterion("infra_before_excp >", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpGreaterThanOrEqualTo(String value) {
            addCriterion("infra_before_excp >=", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpLessThan(String value) {
            addCriterion("infra_before_excp <", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpLessThanOrEqualTo(String value) {
            addCriterion("infra_before_excp <=", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpLike(String value) {
            addCriterion("infra_before_excp like", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpNotLike(String value) {
            addCriterion("infra_before_excp not like", value, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpIn(List<String> values) {
            addCriterion("infra_before_excp in", values, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpNotIn(List<String> values) {
            addCriterion("infra_before_excp not in", values, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpBetween(String value1, String value2) {
            addCriterion("infra_before_excp between", value1, value2, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraBeforeExcpNotBetween(String value1, String value2) {
            addCriterion("infra_before_excp not between", value1, value2, "infraBeforeExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpIsNull() {
            addCriterion("infra_after_excp is null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpIsNotNull() {
            addCriterion("infra_after_excp is not null");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpEqualTo(String value) {
            addCriterion("infra_after_excp =", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpNotEqualTo(String value) {
            addCriterion("infra_after_excp <>", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpGreaterThan(String value) {
            addCriterion("infra_after_excp >", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpGreaterThanOrEqualTo(String value) {
            addCriterion("infra_after_excp >=", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpLessThan(String value) {
            addCriterion("infra_after_excp <", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpLessThanOrEqualTo(String value) {
            addCriterion("infra_after_excp <=", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpLike(String value) {
            addCriterion("infra_after_excp like", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpNotLike(String value) {
            addCriterion("infra_after_excp not like", value, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpIn(List<String> values) {
            addCriterion("infra_after_excp in", values, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpNotIn(List<String> values) {
            addCriterion("infra_after_excp not in", values, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpBetween(String value1, String value2) {
            addCriterion("infra_after_excp between", value1, value2, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andInfraAfterExcpNotBetween(String value1, String value2) {
            addCriterion("infra_after_excp not between", value1, value2, "infraAfterExcp");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeIsNull() {
            addCriterion("medication_before is null");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeIsNotNull() {
            addCriterion("medication_before is not null");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeEqualTo(String value) {
            addCriterion("medication_before =", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeNotEqualTo(String value) {
            addCriterion("medication_before <>", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeGreaterThan(String value) {
            addCriterion("medication_before >", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("medication_before >=", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeLessThan(String value) {
            addCriterion("medication_before <", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeLessThanOrEqualTo(String value) {
            addCriterion("medication_before <=", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeLike(String value) {
            addCriterion("medication_before like", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeNotLike(String value) {
            addCriterion("medication_before not like", value, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeIn(List<String> values) {
            addCriterion("medication_before in", values, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeNotIn(List<String> values) {
            addCriterion("medication_before not in", values, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeBetween(String value1, String value2) {
            addCriterion("medication_before between", value1, value2, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationBeforeNotBetween(String value1, String value2) {
            addCriterion("medication_before not between", value1, value2, "medicationBefore");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterIsNull() {
            addCriterion("medication_after is null");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterIsNotNull() {
            addCriterion("medication_after is not null");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterEqualTo(String value) {
            addCriterion("medication_after =", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterNotEqualTo(String value) {
            addCriterion("medication_after <>", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterGreaterThan(String value) {
            addCriterion("medication_after >", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterGreaterThanOrEqualTo(String value) {
            addCriterion("medication_after >=", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterLessThan(String value) {
            addCriterion("medication_after <", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterLessThanOrEqualTo(String value) {
            addCriterion("medication_after <=", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterLike(String value) {
            addCriterion("medication_after like", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterNotLike(String value) {
            addCriterion("medication_after not like", value, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterIn(List<String> values) {
            addCriterion("medication_after in", values, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterNotIn(List<String> values) {
            addCriterion("medication_after not in", values, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterBetween(String value1, String value2) {
            addCriterion("medication_after between", value1, value2, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andMedicationAfterNotBetween(String value1, String value2) {
            addCriterion("medication_after not between", value1, value2, "medicationAfter");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeIsNull() {
            addCriterion("time_before is null");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeIsNotNull() {
            addCriterion("time_before is not null");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeEqualTo(Date value) {
            addCriterion("time_before =", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeNotEqualTo(Date value) {
            addCriterion("time_before <>", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeGreaterThan(Date value) {
            addCriterion("time_before >", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeGreaterThanOrEqualTo(Date value) {
            addCriterion("time_before >=", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeLessThan(Date value) {
            addCriterion("time_before <", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeLessThanOrEqualTo(Date value) {
            addCriterion("time_before <=", value, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeIn(List<Date> values) {
            addCriterion("time_before in", values, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeNotIn(List<Date> values) {
            addCriterion("time_before not in", values, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeBetween(Date value1, Date value2) {
            addCriterion("time_before between", value1, value2, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeBeforeNotBetween(Date value1, Date value2) {
            addCriterion("time_before not between", value1, value2, "timeBefore");
            return (Criteria) this;
        }

        public Criteria andTimeAfterIsNull() {
            addCriterion("time_after is null");
            return (Criteria) this;
        }

        public Criteria andTimeAfterIsNotNull() {
            addCriterion("time_after is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAfterEqualTo(Date value) {
            addCriterion("time_after =", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterNotEqualTo(Date value) {
            addCriterion("time_after <>", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterGreaterThan(Date value) {
            addCriterion("time_after >", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterGreaterThanOrEqualTo(Date value) {
            addCriterion("time_after >=", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterLessThan(Date value) {
            addCriterion("time_after <", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterLessThanOrEqualTo(Date value) {
            addCriterion("time_after <=", value, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterIn(List<Date> values) {
            addCriterion("time_after in", values, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterNotIn(List<Date> values) {
            addCriterion("time_after not in", values, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterBetween(Date value1, Date value2) {
            addCriterion("time_after between", value1, value2, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeAfterNotBetween(Date value1, Date value2) {
            addCriterion("time_after not between", value1, value2, "timeAfter");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleIsNull() {
            addCriterion("time_middle is null");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleIsNotNull() {
            addCriterion("time_middle is not null");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleEqualTo(Date value) {
            addCriterion("time_middle =", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleNotEqualTo(Date value) {
            addCriterion("time_middle <>", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleGreaterThan(Date value) {
            addCriterion("time_middle >", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleGreaterThanOrEqualTo(Date value) {
            addCriterion("time_middle >=", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleLessThan(Date value) {
            addCriterion("time_middle <", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleLessThanOrEqualTo(Date value) {
            addCriterion("time_middle <=", value, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleIn(List<Date> values) {
            addCriterion("time_middle in", values, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleNotIn(List<Date> values) {
            addCriterion("time_middle not in", values, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleBetween(Date value1, Date value2) {
            addCriterion("time_middle between", value1, value2, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTimeMiddleNotBetween(Date value1, Date value2) {
            addCriterion("time_middle not between", value1, value2, "timeMiddle");
            return (Criteria) this;
        }

        public Criteria andTreatIsNull() {
            addCriterion("treat is null");
            return (Criteria) this;
        }

        public Criteria andTreatIsNotNull() {
            addCriterion("treat is not null");
            return (Criteria) this;
        }

        public Criteria andTreatEqualTo(String value) {
            addCriterion("treat =", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatNotEqualTo(String value) {
            addCriterion("treat <>", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatGreaterThan(String value) {
            addCriterion("treat >", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatGreaterThanOrEqualTo(String value) {
            addCriterion("treat >=", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatLessThan(String value) {
            addCriterion("treat <", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatLessThanOrEqualTo(String value) {
            addCriterion("treat <=", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatLike(String value) {
            addCriterion("treat like", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatNotLike(String value) {
            addCriterion("treat not like", value, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatIn(List<String> values) {
            addCriterion("treat in", values, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatNotIn(List<String> values) {
            addCriterion("treat not in", values, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatBetween(String value1, String value2) {
            addCriterion("treat between", value1, value2, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatNotBetween(String value1, String value2) {
            addCriterion("treat not between", value1, value2, "treat");
            return (Criteria) this;
        }

        public Criteria andTreatDetailIsNull() {
            addCriterion("treat_detail is null");
            return (Criteria) this;
        }

        public Criteria andTreatDetailIsNotNull() {
            addCriterion("treat_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTreatDetailEqualTo(String value) {
            addCriterion("treat_detail =", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailNotEqualTo(String value) {
            addCriterion("treat_detail <>", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailGreaterThan(String value) {
            addCriterion("treat_detail >", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailGreaterThanOrEqualTo(String value) {
            addCriterion("treat_detail >=", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailLessThan(String value) {
            addCriterion("treat_detail <", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailLessThanOrEqualTo(String value) {
            addCriterion("treat_detail <=", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailLike(String value) {
            addCriterion("treat_detail like", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailNotLike(String value) {
            addCriterion("treat_detail not like", value, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailIn(List<String> values) {
            addCriterion("treat_detail in", values, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailNotIn(List<String> values) {
            addCriterion("treat_detail not in", values, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailBetween(String value1, String value2) {
            addCriterion("treat_detail between", value1, value2, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatDetailNotBetween(String value1, String value2) {
            addCriterion("treat_detail not between", value1, value2, "treatDetail");
            return (Criteria) this;
        }

        public Criteria andTreatCountIsNull() {
            addCriterion("treat_count is null");
            return (Criteria) this;
        }

        public Criteria andTreatCountIsNotNull() {
            addCriterion("treat_count is not null");
            return (Criteria) this;
        }

        public Criteria andTreatCountEqualTo(Integer value) {
            addCriterion("treat_count =", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountNotEqualTo(Integer value) {
            addCriterion("treat_count <>", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountGreaterThan(Integer value) {
            addCriterion("treat_count >", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("treat_count >=", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountLessThan(Integer value) {
            addCriterion("treat_count <", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountLessThanOrEqualTo(Integer value) {
            addCriterion("treat_count <=", value, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountIn(List<Integer> values) {
            addCriterion("treat_count in", values, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountNotIn(List<Integer> values) {
            addCriterion("treat_count not in", values, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountBetween(Integer value1, Integer value2) {
            addCriterion("treat_count between", value1, value2, "treatCount");
            return (Criteria) this;
        }

        public Criteria andTreatCountNotBetween(Integer value1, Integer value2) {
            addCriterion("treat_count not between", value1, value2, "treatCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}