package com.zhuzb.cn.test;

import com.zhuzb.cn.domain.User;
import com.zhuzb.cn.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @project: com.zhuzb.cn.test
 * @class: MyBatisTest
 * @author: zhuzb
 * @date: 2019/11/19 16:18
 * @Version 0.0.1
 * @description: 略。
 */
public class MyBatisTest {

    private InputStream is;
    private UserMapper mapper;
    private SqlSession session;

    @Before
    public void init() throws Exception {
        // 读取配置文件
        is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(is);
        // 创建SqlSession对象
        session = factory.openSession();
        // 获取mapper接口的代理对象
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void destroy() throws Exception{
        // 默认情况下不会自动提交，所以需要在每次执行完修改操作后手动提交到数据库
        // 也可以在openSession()方法中传入参数，即factory.openSession(true)，这样每次都会自动提交。
        session.commit();
        session.close();
        is.close();
    }

    @Test
    public void testFindById() {
        System.out.println("Hello World.");
        User user = mapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void testFindByIds() {
        List<Integer> ids = new ArrayList<Integer>();
//        ids.add(1);
        ids.add(3);
        List<User> users = mapper.findByIds(ids);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByName() {
        String name = "%李%";
//        String name = "三";
        List<User> users = mapper.findByName(name);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void saveUserTest(){
        User user = new User();
        user.setUserName("小李3");
        user.setSex("女");
        user.setBirthday(new Date(31354654654L));
        user.setHeight(176.0);
        int id = mapper.saveUser(user);
        System.out.println(id);
        System.out.println(user.getUid());
    }

    @Test
    public void totalUsersTest(){
        int total = mapper.totalUsers();
        System.out.println(total);
    }
}