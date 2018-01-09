package com.yibai.sms.sdk.request;

import com.yibai.sms.sdk.common.YibaiRequest;
import com.yibai.sms.sdk.response.UserInfoResponse;

public class UserInfoRequest extends YibaiRequest<UserInfoResponse> {

    @Override
    public String getApiUrlPath() {
        return "/user/info";
    }

    @Override
    public Class<UserInfoResponse> getResponseClass() {
        return UserInfoResponse.class;
    }
}
