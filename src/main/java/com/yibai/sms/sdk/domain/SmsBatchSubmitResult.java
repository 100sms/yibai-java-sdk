package com.yibai.sms.sdk.domain;

/**
 * 批量发送返回结果
 *
 * @author wei.en
 */
public class SmsBatchSubmitResult {

    private Integer code;

    private String message;

    private String mobile;

    private Long taskId;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
