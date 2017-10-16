package com.yibai.sms.sdk.common;


public class YibaiException extends RuntimeException {

    public YibaiException(String message) {
        super(message);
    }

    public YibaiException(String message, Throwable cause) {
        super(message, cause);
    }

    public YibaiException(Throwable cause) {
        super(cause);
    }

}
