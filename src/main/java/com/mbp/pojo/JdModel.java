package com.mbp.pojo;

/**
 * FileName:JdModel
 * Author:  ghw06
 * Date:    2018/4/24 16:28
 * Description: 用来封装对象  京东书籍数据
 */
public class JdModel {

    private String bookId;
    private String bookName;
    private String bookPrice;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }
}
