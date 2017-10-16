package com.yibai.sms.sdk.domain;

/**
 * 消息
 *
 * @author ppchen
 */
public class SmsSubmit {

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 消息内容
     */
    private String message;

    public SmsSubmit(String mobile, String message) {
        this.mobile = mobile;
        this.message = message;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
