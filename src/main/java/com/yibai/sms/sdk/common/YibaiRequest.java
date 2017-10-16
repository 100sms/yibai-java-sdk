package com.yibai.sms.sdk.common;

import java.beans.Transient;

/**
 * 基础请求信息
 *
 * @author twang
 */
public abstract class YibaiRequest<T> {

    private String apikey;

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    @Transient
    public abstract String getApiUrlPath();

    @Transient
    public abstract Class<T> getResponseClass();

}
