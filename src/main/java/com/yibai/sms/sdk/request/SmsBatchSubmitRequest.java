package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.domain.SmsSubmit;
import com.yibai.sms.sdk.response.SmsBatchSubmitResponse;

import java.util.List;

public class SmsBatchSubmitRequest extends YibaiRequest<SmsBatchSubmitResponse> {

    private List<SmsSubmit> submits;

    public List<SmsSubmit> getSubmits() {
        return submits;
    }

    public void setSubmits(List<SmsSubmit> submits) {
        this.submits = submits;
    }

    @Override
    public String getApiUrlPath() {
        return "/sms/batchSubmit";
    }

    @Override
    public Class<SmsBatchSubmitResponse> getResponseClass() {
        return SmsBatchSubmitResponse.class;
    }
}
