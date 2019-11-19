package com.zhuzb.cn.service.impl;

import com.zhuzb.cn.domain.User;
import com.zhuzb.cn.service.UserService;
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
    public String findById(int id) {
        return "测试成功";
    }

    public List<User> findByIds(int[] ids) {
        return null;
    }
}
