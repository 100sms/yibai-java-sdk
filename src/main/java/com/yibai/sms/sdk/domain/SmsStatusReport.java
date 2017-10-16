package com.yibai.sms.sdk.domain;

/**
 * 短信发送状态
 *
 * @author ppchen
 */
public class SmsStatusReport {

    private Long taskId;

    private String mobile;

    private String report;

    private Long reportTime;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

}
