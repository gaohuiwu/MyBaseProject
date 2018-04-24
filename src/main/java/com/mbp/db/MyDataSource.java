package com.mbp.db;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/**
 * FileName:MyDataSource
 * Author:  ghw06
 * Date:    2018/4/24 17:05
 * Description:
 */
public class MyDataSource {
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        //MySQL的jdbc驱动
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("gaohuiwu");              //所要连接的数据库名
        ds.setPassword("930614.gao");                //MySQL的登陆密码
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/mydb");
        return ds;
    }
}
