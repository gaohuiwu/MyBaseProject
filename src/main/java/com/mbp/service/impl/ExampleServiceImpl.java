package com.mbp.service.impl;

import com.mbp.dao.ExampleDao;
import com.mbp.pojo.ExampleEntity;
import com.mbp.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FileName:ExampleServiceImpl
 * Author:  ghw06
 * Date:    2017/12/17 13:00
 * Description: demo服务实现类
 */
@Service("userService")
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleDao userDao;

    @Override
    public ExampleEntity getUserById(long userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public List<ExampleEntity> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public ExampleEntity insertAndGet(ExampleEntity user) {
        userDao.insertUser(user);
        return userDao.getUserById(user.getId());
    }
}
