package com.yibai.sms.sdk.internal.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class HttpUtils {

    private static final Log logger = LogFactory.getLog(HttpUtils.class);

    private static final int CONNECTION_TIMEOUT = 5000;
    private static final int SOCKET_TIMEOUT = 5000;

    private static CloseableHttpClient httpClient;

    static {
        try {
            httpClient = createSSLClientDefault();
        } catch (Exception e) {
            logger.error("Create SSL client error.", e);
            System.exit(1);
        }
    }

    private static CloseableHttpClient createSSLClientDefault() throws Exception {
        SSLContext sslContext =
                new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                    //信任所有
                    public boolean isTrusted(X509Certificate[] chain, String authType)
                            throws CertificateException {
                        return true;
                    }
                }).build();
        SSLConnectionSocketFactory factory = new SSLConnectionSocketFactory(sslContext);
        return HttpClients.custom().setSSLSocketFactory(factory).build();
    }

    public static String postJson(String url, String json) throws IOException {
        HttpPost method = new HttpPost(url);
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECTION_TIMEOUT)
                .setSocketTimeout(SOCKET_TIMEOUT).build(); // 设置请求超时时间
        method.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        try {
            StringEntity requestEntity = new StringEntity(json, ContentType.APPLICATION_JSON);
            method.setEntity(requestEntity);
            response = httpClient.execute(method);
            HttpEntity entity = response.getEntity();
            String responseText = "";
            if (entity != null) {
                responseText = EntityUtils.toString(entity);
            }
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                throw new RuntimeException("Http request error, status code: " + statusCode);
            }
            return responseText;
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

}
