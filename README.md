# 亿佰云通讯 sdk

---

 - 添加maven依赖
 
```
 <dependency>
  <groupId>com.github.100sms</groupId>
  <artifactId>yibai-sms-java-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```
*如果非maven项目可手动[获取jar包][1]*

 - 调用方法
```
//调用地址
private static final String serverUrl = "https://sms.100sms.cn/api";
// 修改为您的apikey
private static final String apikey = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
//初始化client
private static final YibaiClient client = new DefaultYibaiClient(serverUrl, apikey);

/**
*批量发送验证码短信的调用示例
*/
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
```

  [1]: http://search.maven.org/#search%7Cga%7C1%7Ccom.github.100sms
  
