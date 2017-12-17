package com.mbp.service;

import com.mbp.pojo.ExampleEntity;

import java.util.List;

/**
 * FileName:ExampleService
 * Author:  ghw06
 * Date:    2017/12/17 12:57
 * Description: demo服务接口
 */
public interface ExampleService {

    /**
     * 通过ID获取用户
     *
     * @param userId
     * @return
     */
    ExampleEntity getUserById(long userId);

    /**
     * 获取所有用户
     *
     * @return
     */
    List<ExampleEntity> getUsers();

    /**
     * 新增一个用户并获取
     *
     * @param user
     * @return
     */
    ExampleEntity insertAndGet(ExampleEntity user);
}
