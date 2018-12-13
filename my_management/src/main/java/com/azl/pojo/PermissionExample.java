package com.azl.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PermissionExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andPermitIdIsNull() {
            addCriterion("permit_id is null");
            return (Criteria) this;
        }

        public Criteria andPermitIdIsNotNull() {
            addCriterion("permit_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermitIdEqualTo(Integer value) {
            addCriterion("permit_id =", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdNotEqualTo(Integer value) {
            addCriterion("permit_id <>", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdGreaterThan(Integer value) {
            addCriterion("permit_id >", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permit_id >=", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdLessThan(Integer value) {
            addCriterion("permit_id <", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdLessThanOrEqualTo(Integer value) {
            addCriterion("permit_id <=", value, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdIn(List<Integer> values) {
            addCriterion("permit_id in", values, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdNotIn(List<Integer> values) {
            addCriterion("permit_id not in", values, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdBetween(Integer value1, Integer value2) {
            addCriterion("permit_id between", value1, value2, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permit_id not between", value1, value2, "permitId");
            return (Criteria) this;
        }

        public Criteria andPermitUrlIsNull() {
            addCriterion("permit_url is null");
            return (Criteria) this;
        }

        public Criteria andPermitUrlIsNotNull() {
            addCriterion("permit_url is not null");
            return (Criteria) this;
        }

        public Criteria andPermitUrlEqualTo(String value) {
            addCriterion("permit_url =", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlNotEqualTo(String value) {
            addCriterion("permit_url <>", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlGreaterThan(String value) {
            addCriterion("permit_url >", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("permit_url >=", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlLessThan(String value) {
            addCriterion("permit_url <", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlLessThanOrEqualTo(String value) {
            addCriterion("permit_url <=", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlLike(String value) {
            addCriterion("permit_url like", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlNotLike(String value) {
            addCriterion("permit_url not like", value, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlIn(List<String> values) {
            addCriterion("permit_url in", values, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlNotIn(List<String> values) {
            addCriterion("permit_url not in", values, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlBetween(String value1, String value2) {
            addCriterion("permit_url between", value1, value2, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andPermitUrlNotBetween(String value1, String value2) {
            addCriterion("permit_url not between", value1, value2, "permitUrl");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNull() {
            addCriterion("permit_name is null");
            return (Criteria) this;
        }

        public Criteria andPermitNameIsNotNull() {
            addCriterion("permit_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermitNameEqualTo(String value) {
            addCriterion("permit_name =", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotEqualTo(String value) {
            addCriterion("permit_name <>", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThan(String value) {
            addCriterion("permit_name >", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameGreaterThanOrEqualTo(String value) {
            addCriterion("permit_name >=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThan(String value) {
            addCriterion("permit_name <", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLessThanOrEqualTo(String value) {
            addCriterion("permit_name <=", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameLike(String value) {
            addCriterion("permit_name like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotLike(String value) {
            addCriterion("permit_name not like", value, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameIn(List<String> values) {
            addCriterion("permit_name in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotIn(List<String> values) {
            addCriterion("permit_name not in", values, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameBetween(String value1, String value2) {
            addCriterion("permit_name between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andPermitNameNotBetween(String value1, String value2) {
            addCriterion("permit_name not between", value1, value2, "permitName");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("Reserved_1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("Reserved_1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("Reserved_1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("Reserved_1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("Reserved_1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("Reserved_1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("Reserved_1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("Reserved_1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("Reserved_1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("Reserved_1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("Reserved_1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("Reserved_1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("Reserved_1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("Reserved_1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("Reserved_2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("Reserved_2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("Reserved_2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("Reserved_2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("Reserved_2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("Reserved_2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("Reserved_2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("Reserved_2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("Reserved_2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("Reserved_2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("Reserved_2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("Reserved_2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("Reserved_2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("Reserved_2 not between", value1, value2, "reserved2");
            return (Criteria) this;
        }
    }

    /**
     */
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