package com.zhuzb.cn.service.impl;

import com.zhuzb.cn.domain.User;
import com.zhuzb.cn.mapper.UserMapper;
import com.zhuzb.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project: com.zhuzb.cn.service.impl
 * @class: UserServiceImpl
 * @author: zhuzb
 * @date: 2019/11/19 11:15
 * @Version 0.0.1
 * @description: 略。
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }

    public List<User> findByIds(int[] ids) {
        return null;
    }
}
