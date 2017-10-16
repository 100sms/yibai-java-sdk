package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.SmsPullReplyMessageResponse;

public class SmsPullReplyMessageRequest extends YibaiRequest<SmsPullReplyMessageResponse> {

    @Override
    public String getApiUrlPath() {
        return "/sms/pullReply";
    }

    @Override
    public Class<SmsPullReplyMessageResponse> getResponseClass() {
        return SmsPullReplyMessageResponse.class;
    }
}
