package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.SmsPullStatusReportResponse;

public class SmsPullStatusReportRequest extends YibaiRequest<SmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullStatusReport";
    }

    @Override
    public Class<SmsPullStatusReportResponse> getResponseClass() {
        return SmsPullStatusReportResponse.class;
    }
}
