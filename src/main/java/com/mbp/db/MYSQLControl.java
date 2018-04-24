package com.mbp.db;

import com.mbp.pojo.JdModel;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * FileName:MYSQLControl
 * Author:  ghw06
 * Date:    2018/4/24 17:07
 * Description:
 */
public class MYSQLControl {

    //根据自己的数据库地址修改
    static DataSource ds = MyDataSource.getDataSource();
    static QueryRunner qr = new QueryRunner(ds);

    //第一类方法
    public static void executeUpdate(String sql) {
        try {
            qr.update(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //第二类数据库操作方法
    public static void executeInsert(List<JdModel> jingdongdata) throws SQLException {
        /*
         * 定义一个Object数组，行列
         * 3表示列数，根据自己的数据定义这里面的数字
         * params[i][0]等是对数组赋值，这里用到集合的get方法
         *
         */
        Object[][] params = new Object[jingdongdata.size()][3];
        for (int i = 0; i < params.length; i++) {
            params[i][0] = jingdongdata.get(i).getBookId();
            params[i][1] = jingdongdata.get(i).getBookName();
            params[i][2] = jingdongdata.get(i).getBookPrice();
        }
        qr.batch("insert into jingdongbook (bookId, bookName, bookPrice)"
                + "values (?,?,?)", params);
        System.out.println("执行数据库完毕！" + "成功插入数据：" + jingdongdata.size() + "条");

    }
}
