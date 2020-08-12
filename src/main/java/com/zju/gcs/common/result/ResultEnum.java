package com.zju.gcs.common.result;

/**
 * @author sy
 * @create 2019-10-11:27
 */
public enum ResultEnum {
    SUCCESS("200", "成功");

    String code;
    String msg;

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
