package com.yibai.sms.sdk.domain;

/**
 * 用户信息
 */
public class UserInfo {

    /**
     * 用户名
     */
    private String username;
    /**
     * 短信余额
     */
    private Integer smsBalance;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 创建时间
     */
    private Long createdTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSmsBalance() {
        return smsBalance;
    }

    public void setSmsBalance(Integer smsBalance) {
        this.smsBalance = smsBalance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}
