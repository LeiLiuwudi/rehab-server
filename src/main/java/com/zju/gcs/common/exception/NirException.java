package com.zju.gcs.common.exception;

public class NirException extends RuntimeException {

    private String detailCode;

    public NirException(NirExceptionEnum nirExceptionEnum) {
        super(nirExceptionEnum.getDesc());
        this.detailCode = nirExceptionEnum.getCode();
    }

    public String getCode() {
        return detailCode;
    }
}
