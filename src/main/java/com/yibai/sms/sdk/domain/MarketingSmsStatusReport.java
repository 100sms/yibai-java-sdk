package com.yibai.sms.sdk.domain;

public class MarketingSmsStatusReport {
    private String taskId;
    private String mobile;
    private String report;
    private long reportTime;
    public String getTaskId() {
        return taskId;
    }
    public void setTaskId(String taskId) {
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
    public long getReportTime() {
        return reportTime;
    }
    public void setReportTime(long reportTime) {
        this.reportTime = reportTime;
    }
}
