package com.yibai.sms.sdk.common;

import java.beans.Transient;
import java.io.Serializable;

/**
 * 基础响应信息
 *
 * @author twang
 */
public abstract class YibaiResponse<T> implements Serializable {

    private static final int SUCCESS = 200;

    private int code;

    private String message;

    private T response;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Transient
    public boolean isSuccess() {
        return code == SUCCESS;
    }

}
