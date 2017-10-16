package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.MarketingSmsPullStatusReportResponse;

public class MarketingSmsPullStatusReportRequest extends YibaiRequest<MarketingSmsPullStatusReportResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullStatusReport";
    }

    @Override
    public Class<MarketingSmsPullStatusReportResponse> getResponseClass() {
        return MarketingSmsPullStatusReportResponse.class;
    }

}
