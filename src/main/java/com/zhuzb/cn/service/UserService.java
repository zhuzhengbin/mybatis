package com.zhuzb.cn.service;

import com.zhuzb.cn.domain.User;

import java.util.List;

/**
 * @project: com.zhuzb.cn.service
 * @class: UserService
 * @author: zhuzb
 * @date: 2019/11/19 11:13
 * @Version 0.0.1
 * @description: 略。
 */
public interface UserService {
    /**
     * 根据id查找单个用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 批量查询用户
     * @param ids
     * @return
     */
    List<User> findByIds(int[] ids);
}








