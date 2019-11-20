package com.zhuzb.cn.mapper;

import com.sun.istack.internal.NotNull;
import com.zhuzb.cn.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 根据某个id查找某个对象
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 批量查找多个用户
     * @param ids
     * @return
     */
    // 这里的@Param注解指明了向MyBatis中传入的参数名称
    List<User> findByIds(@Param("ids") List<Integer> ids);

    /**
     * 模糊查找
     * @return
     */
    List<User> findByName(String username);

    /**
     * 保存用户
     * @param user
     */
    int saveUser(User user);

    /**
     * 统计用户总数
     * @return
     */
    int totalUsers();
}
