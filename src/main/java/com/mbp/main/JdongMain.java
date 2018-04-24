package com.mbp.main;

import com.mbp.db.MYSQLControl;
import com.mbp.pojo.JdModel;
import com.mbp.utils.URLFecter;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * FileName:JdongMain
 * Author:  ghw06
 * Date:    2018/4/24 16:31
 * Description: 爬虫主方法
 */
public class JdongMain {

    static final Logger logger = LoggerFactory.getLogger(JdongMain.class);

    public static void main(String[] args) throws Exception {
        HttpClient httpClient = new DefaultHttpClient();
        //我们要爬取的一个地址,这里可以从数据库中抽取数据,然后利用循环,可以爬取一个URL队列
        String url = "http://search.jd.com/Search?keyword=Python&enc=utf-8&book=y&wq=Python&pvid=33xo9lni.p4a1qb";
        //抓取的数据
        List<JdModel> bookdatas = URLFecter.URLParser(httpClient, url);
        //循环输出抓取的数据
        for (JdModel jd : bookdatas) {
            logger.info("bookID:" + jd.getBookId() + "\t" + "bookPrice:" + jd.getBookPrice() + "\t" + "bookName:" + jd.getBookName());
        }
        //将抓取的数据插入数据库
        MYSQLControl.executeInsert(bookdatas);
    }
}
