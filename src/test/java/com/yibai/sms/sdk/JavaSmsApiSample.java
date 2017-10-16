package com.yibai.sms.sdk;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
* 说明:
* 以下代码展示的是非sdk下的调用，只是为了方便用户测试而提供的样例代码，用户也可自行编写。
* 正式环境建议使用sdk进行调用以提高效率，sdk中包含了使用样例
* 代码中额外使用了apache下的HttpClient，已包含在sdk中
*/
public class JavaSmsApiSample {

    public static void main(String... args) throws IOException {
        String json = ("{" +
                "  'apikey':'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'," + // 修改为您的apikey
                "  'submits':[{" +
                "    'mobile':'187xxxxxxxx'," +  // 修改为您要发送的手机号
                "    'message':'【亿佰云通讯】您的验证码是：1234'" + // 修改为您要发送的内容，内容必须和某个模板匹配
                "  }]" +
                "}"
        ).replace('\'', '"');
        System.out.println(postJson("https://sms.100sms.cn/api/sms/batchSubmit", json));
    }

    /**
     * @param url  提交的URL
     * @param json json参数
     * @return 提交响应
     */
    public static String postJson(String url, String json) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost method = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000)
                .setSocketTimeout(5000).build(); // 设置请求超时时间
        method.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        try {
            StringEntity requestEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
            method.setEntity(requestEntity);
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            String responseText = "";
            if (entity != null) {
                responseText = EntityUtils.toString(entity);
            }
            return responseText;
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

}
