package com.mbp.page;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * FileName:PageInfo
 * Author:  ghw06
 * Date:    2018/4/10 9:07
 * Description: 自定义的PageInfo,不同于自带
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;

    //总记录数
    private long totalRecordNum;
    //总页数
    private int pages;

    //结果集
    private List<T> result;

    public PageInfo() {
    }

    /**
     * 包装Page对象
     *
     * @param result
     */
    public PageInfo(List<T> result) {
        if (result instanceof Page) {
            Page page = (Page) result;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();

            this.pages = page.getPages();
            this.result = page;
            this.size = page.size();
            this.totalRecordNum = page.getTotal();
        } else if (result instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = result.size();
            this.pages = 1;
            this.result = result;
            this.size = result.size();
            this.totalRecordNum = result.size();
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return totalRecordNum;
    }

    public void setTotal(long total) {
        this.totalRecordNum = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }


    @Override
    public String toString() {
        final StringBuffer builder = new StringBuffer("PageInfo [");
        builder.append("pageNum=").append(pageNum);
        builder.append(", pageSize=").append(pageSize);
        builder.append(", size=").append(size);
        builder.append(", totalRecordNum=").append(totalRecordNum);
        builder.append(", pages=").append(pages);
        builder.append(']');
        return builder.toString();
    }
}
