package com.mbp.utils;

import com.mbp.parse.JdParse;
import com.mbp.pojo.JdModel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileName:URLFecter
 * Author:  ghw06
 * Date:    2018/4/24 16:45
 * Description: 解析抓取的数据
 */
public class URLFecter {

    public static List<JdModel> URLParser(HttpClient httpClient, String url) throws Exception {

        //用来接收解析的数据
        List<JdModel> jingDongDatas = new ArrayList<>();
        //获取网站响应的html，这里调用了HTTPUtils类
        HttpResponse httpResponse = HTTPUtils.getRawHtml(httpClient, url);
        //获取响应状态码
        int StatusCode = httpResponse.getStatusLine().getStatusCode();
        //如果状态响应码为200，则获取html实体内容或者json文件
        if(StatusCode == 200){
            String entity = EntityUtils.toString (httpResponse.getEntity(),"utf-8");
            jingDongDatas = JdParse.getData(entity);
            EntityUtils.consume(httpResponse.getEntity());
        }else {
            //否则，消耗掉实体
            EntityUtils.consume(httpResponse.getEntity());
        }
        return jingDongDatas;


    }
}
