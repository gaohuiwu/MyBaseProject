package com.mbp.dao;

import com.mbp.pojo.ExampleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * FileName:ExampleDao
 * Author:  ghw06
 * Date:    2017/12/17 12:31
 * Description: demo接口
 */
@Repository("userDao")
public interface ExampleDao {
    /**
     * 通过ID获取用户
     * @param userId
     * @return
     */
    ExampleEntity getUserById(long userId);

    /**
     * 获取所有用户
     * @return
     */
    List<ExampleEntity> getUsers();

    /**
     * 新增一个用户
     * @param user
     */
    void insertUser(ExampleEntity user);
}
