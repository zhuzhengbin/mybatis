package com.zhuzb.test;

import com.zhuzb.cn.domain.User;
import com.zhuzb.cn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.websocket.Session;
import java.io.InputStream;
import java.util.List;

/**
 * @project: com.zhuzb.test
 * @class: MyBatisTest
 * @author: zhuzb
 * @date: 2019/11/19 11:44
 * @Version 0.0.1
 * @description: 略。
 */
public class MyBatisTest {

    public static void main(String[] args) throws Exception {
        // 读取MyBatis配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建Builder对象
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        // 从配置文件中加载factory对象
        SqlSessionFactory factory = factoryBuilder.build(is);
        // 生成Session
        SqlSession session = factory.openSession();
        // 使用SqlSession创建mapper接口的代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        // 使用代理对象执行查询方法
        User user = mapper.findById(1);
        System.out.println(user);
        
    }
}
