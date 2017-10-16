package com.yibai.sms.sdk;

import com.yibai.sms.sdk.common.YibaiApiException;
import com.yibai.sms.sdk.domain.SmsSubmit;
import org.junit.Test;

import java.util.Arrays;

public class YibaiClientTest {

    private static final String serverUrl = "https://sms.100sms.cn/api";
    private static final String apikey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";// 修改为您的apikey
    private static final YibaiClient client = new DefaultYibaiClient(serverUrl, apikey);

    @Test
    public void testSmsBatchSubmit() {
        try {
            client.smsBatchSubmit(Arrays.asList(
                    new SmsSubmit("187xxxxxxxx", "【亿佰云通讯】您的验证码是：1234"),//修改为你要发送的手机号和短信内容
                    new SmsSubmit("186xxxxxxxx", "【亿佰云通讯】您的验证码是：5678")//修改为你要发送的手机号和短信内容
            ));
        } catch (YibaiApiException e) {
            System.out.println("YibaiApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullStatusReport() {
        try {
            client.smsPullStatusReport();
        } catch (YibaiApiException e) {
            System.out.println("YibaiApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSmsPullReplyMessage() {
        try {
            client.smsPullReplyMessage();
        } catch (YibaiApiException e) {
            System.out.println("YibaiApiException, code: " + e.getCode() + ", message: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
