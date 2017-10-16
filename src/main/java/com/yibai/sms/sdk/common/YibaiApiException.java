package com.yibai.sms.sdk.common;

public class YibaiApiException extends YibaiException {

    private int code;

    public YibaiApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
