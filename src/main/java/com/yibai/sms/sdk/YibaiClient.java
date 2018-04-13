package com.yibai.sms.sdk;

import com.yibai.sms.sdk.domain.*;

import java.util.List;

/**
 * Yibai 客户端
 *
 * @author twang
 */
public interface YibaiClient {

    List<SmsBatchSubmitResult> smsBatchSubmit(List<SmsSubmit> submits);

    List<SmsStatusReport> smsPullStatusReport();

    List<SmsReplyMessage> smsPullReplyMessage();

    MarketingSmsBatchResult marketingSmsSubmit(String message, String sendTime, List<String> mobiles);

    List<MarketingSmsStatusReport> marketingSmsPullStatusReport();

    List<SmsReplyMessage> marketingSmsPullReplyMessage();

    UserInfo userInfo();

    String smsTest();

}
