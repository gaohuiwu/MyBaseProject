package com.mbp.dao;

import com.mbp.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}