package com.mbp.utils;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicHttpResponse;

import java.io.IOException;

/**
 * FileName:HTTPUtils
 * Author:  ghw06
 * Date:    2018/4/24 16:48
 * Description:
 */
public abstract class HTTPUtils {

    public static HttpResponse getRawHtml(HttpClient httpClient, String url) {
        //获取响应文件，即html，采用get方法获取响应数据
        HttpGet getMethod = new HttpGet(url);
        HttpResponse httpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");

        try {
            //执行get方法
            httpResponse = httpClient.execute(getMethod);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return httpResponse;
    }
}
