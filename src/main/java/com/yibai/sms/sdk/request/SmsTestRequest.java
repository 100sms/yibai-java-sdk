package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.SmsTestResponse;

public class SmsTestRequest extends YibaiRequest<SmsTestResponse> {
    public String getApiUrlPath() {
        return "/sms/test";
    }

    public Class<SmsTestResponse> getResponseClass() {
        return SmsTestResponse.class;
    }
}
