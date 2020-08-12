package com.zju.gcs.common.exception;

public enum NirExceptionEnum {

    GENERAL_EXCEPTION("100", "通用异常"),

    NO_USER_FOUND("300", "用户名或密码错误"),
    USER_EXIST("301", "该用户名已存在"),
    USER_UNLOGIN("302", "用户尚未登录"),

    NO_DISEASE_FOUND("400", "该编号病种不存在"),
    NO_RECORD_FOUND("401", "病历不存在"),
    ;
    private String code;
    private String desc;

    NirExceptionEnum(String code, String msg) {
        this.code = code;
        this.desc = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
