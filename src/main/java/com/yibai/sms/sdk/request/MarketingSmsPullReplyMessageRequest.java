package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.SmsPullMarketingReplyMessageResponse;

public class MarketingSmsPullReplyMessageRequest extends YibaiRequest<SmsPullMarketingReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/marketing/pullReply";
    }

    @Override
    public Class<SmsPullMarketingReplyMessageResponse> getResponseClass() {
        return SmsPullMarketingReplyMessageResponse.class;
    }

}
