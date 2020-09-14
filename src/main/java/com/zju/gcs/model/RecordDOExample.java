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

        public Criteria andPresentHistoryIsNull() {
            addCriterion("present_history is null");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryIsNotNull() {
            addCriterion("present_history is not null");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryEqualTo(String value) {
            addCriterion("present_history =", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotEqualTo(String value) {
            addCriterion("present_history <>", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryGreaterThan(String value) {
            addCriterion("present_history >", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("present_history >=", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLessThan(String value) {
            addCriterion("present_history <", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLessThanOrEqualTo(String value) {
            addCriterion("present_history <=", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryLike(String value) {
            addCriterion("present_history like", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotLike(String value) {
            addCriterion("present_history not like", value, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryIn(List<String> values) {
            addCriterion("present_history in", values, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotIn(List<String> values) {
            addCriterion("present_history not in", values, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryBetween(String value1, String value2) {
            addCriterion("present_history between", value1, value2, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPresentHistoryNotBetween(String value1, String value2) {
            addCriterion("present_history not between", value1, value2, "presentHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNull() {
            addCriterion("past_history is null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNotNull() {
            addCriterion("past_history is not null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryEqualTo(String value) {
            addCriterion("past_history =", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotEqualTo(String value) {
            addCriterion("past_history <>", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThan(String value) {
            addCriterion("past_history >", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("past_history >=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThan(String value) {
            addCriterion("past_history <", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThanOrEqualTo(String value) {
            addCriterion("past_history <=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLike(String value) {
            addCriterion("past_history like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotLike(String value) {
            addCriterion("past_history not like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIn(List<String> values) {
            addCriterion("past_history in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotIn(List<String> values) {
            addCriterion("past_history not in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryBetween(String value1, String value2) {
            addCriterion("past_history between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotBetween(String value1, String value2) {
            addCriterion("past_history not between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNull() {
            addCriterion("disease_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("disease_id =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("disease_id <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("disease_id >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disease_id >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("disease_id <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("disease_id <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("disease_id in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("disease_id not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("disease_id between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disease_id not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andInfraPathIsNull() {
            addCriterion("infra_path is null");
            return (Criteria) this;
        }

        public Criteria andInfraPathIsNotNull() {
            addCriterion("infra_path is not null");
            return (Criteria) this;
        }

        public Criteria andInfraPathEqualTo(String value) {
            addCriterion("infra_path =", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathNotEqualTo(String value) {
            addCriterion("infra_path <>", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathGreaterThan(String value) {
            addCriterion("infra_path >", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathGreaterThanOrEqualTo(String value) {
            addCriterion("infra_path >=", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathLessThan(String value) {
            addCriterion("infra_path <", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathLessThanOrEqualTo(String value) {
            addCriterion("infra_path <=", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathLike(String value) {
            addCriterion("infra_path like", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathNotLike(String value) {
            addCriterion("infra_path not like", value, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathIn(List<String> values) {
            addCriterion("infra_path in", values, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathNotIn(List<String> values) {
            addCriterion("infra_path not in", values, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathBetween(String value1, String value2) {
            addCriterion("infra_path between", value1, value2, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraPathNotBetween(String value1, String value2) {
            addCriterion("infra_path not between", value1, value2, "infraPath");
            return (Criteria) this;
        }

        public Criteria andInfraDescIsNull() {
            addCriterion("infra_desc is null");
            return (Criteria) this;
        }

        public Criteria andInfraDescIsNotNull() {
            addCriterion("infra_desc is not null");
            return (Criteria) this;
        }

        public Criteria andInfraDescEqualTo(String value) {
            addCriterion("infra_desc =", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescNotEqualTo(String value) {
            addCriterion("infra_desc <>", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescGreaterThan(String value) {
            addCriterion("infra_desc >", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescGreaterThanOrEqualTo(String value) {
            addCriterion("infra_desc >=", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescLessThan(String value) {
            addCriterion("infra_desc <", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescLessThanOrEqualTo(String value) {
            addCriterion("infra_desc <=", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescLike(String value) {
            addCriterion("infra_desc like", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescNotLike(String value) {
            addCriterion("infra_desc not like", value, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescIn(List<String> values) {
            addCriterion("infra_desc in", values, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescNotIn(List<String> values) {
            addCriterion("infra_desc not in", values, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescBetween(String value1, String value2) {
            addCriterion("infra_desc between", value1, value2, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraDescNotBetween(String value1, String value2) {
            addCriterion("infra_desc not between", value1, value2, "infraDesc");
            return (Criteria) this;
        }

        public Criteria andInfraExcpIsNull() {
            addCriterion("infra_excp is null");
            return (Criteria) this;
        }

        public Criteria andInfraExcpIsNotNull() {
            addCriterion("infra_excp is not null");
            return (Criteria) this;
        }

        public Criteria andInfraExcpEqualTo(String value) {
            addCriterion("infra_excp =", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpNotEqualTo(String value) {
            addCriterion("infra_excp <>", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpGreaterThan(String value) {
            addCriterion("infra_excp >", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpGreaterThanOrEqualTo(String value) {
            addCriterion("infra_excp >=", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpLessThan(String value) {
            addCriterion("infra_excp <", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpLessThanOrEqualTo(String value) {
            addCriterion("infra_excp <=", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpLike(String value) {
            addCriterion("infra_excp like", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpNotLike(String value) {
            addCriterion("infra_excp not like", value, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpIn(List<String> values) {
            addCriterion("infra_excp in", values, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpNotIn(List<String> values) {
            addCriterion("infra_excp not in", values, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpBetween(String value1, String value2) {
            addCriterion("infra_excp between", value1, value2, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andInfraExcpNotBetween(String value1, String value2) {
            addCriterion("infra_excp not between", value1, value2, "infraExcp");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
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