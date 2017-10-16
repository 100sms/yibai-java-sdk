package com.yibai.sms.sdk.domain;

/**
 * 短信回复信息
 *
 * @author ppchen
 */
public class SmsReplyMessage {

    private String mobile;

    private String message;

    private Long replyTime;

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

    public Long getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Long replyTime) {
        this.replyTime = replyTime;
    }

}
