package com.zhuzb.cn.test;

import com.zhuzb.cn.domain.User;
import com.zhuzb.cn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @project: com.zhuzb.cn.test
 * @class: MyBatisTest
 * @author: zhuzb
 * @date: 2019/11/19 16:08
 * @Version 0.0.1
 * @description: 略。
 */
public class MyBatisTest {

    public static void main(String[] args) throws Exception{
        // 读取配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(is);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取mapper接口的代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 通过代理对象执行相应方法
        User user = mapper.findById(2);
        System.out.println(user);
    }
}
