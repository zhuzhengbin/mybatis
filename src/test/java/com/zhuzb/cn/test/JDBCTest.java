package com.zhuzb.cn.test;

import java.sql.*;

/**
 * @project: com.zhuzb.cn.test
 * @class: JDBCTest
 * @author: zhuzb
 * @date: 2019/11/19 10:13
 * @Version 0.0.1
 * @description: 略。
 */
public class JDBCTest {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // 1. 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "root");
            // 3. 获取预处理语句
            statement = connection.prepareStatement("select * from user where id = ?");
            // 4. 向预处理语句中传入参数
            statement.setInt(1, 1);
            // 5. 获取语句执行结果
            resultSet = statement.executeQuery();
            // 遍历结果集合
            while (resultSet.next()) {
                System.out.println("姓名：" + resultSet.getString("name") + "  生日：" + resultSet.getString("birthday"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//import java.sql.*;
//
//public class JDBCTest {
//    // 方便起见，直接在方法上抛出异常
//    public static void main(String[] args) throws Exception {
//        // 加载数据库驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        // 从驱动中获取数据库连接
//        Connection connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8",
//                "root",
//                "root");
//        String sql = "select * from user where id = ?";
//        // 获取预处理语句
//        // 这里要额外注意，PreparedStatement和方法prepareStatement之间相差一个'd'
//        PreparedStatement statement = connection.prepareStatement(sql);
//        // 为预处理语句设置参数
//        // 第一个参数为下标，从1开始；第二个参数为传入的值
//        statement.setInt(1, 2);
//        // 执行预处理语句，获取结果集
//        ResultSet resultSet = statement.executeQuery();
//        // 遍历结果集
//        while (resultSet.next()) {
//            System.out.println("名字："+resultSet.getString("name") + "  生日：" + resultSet.getString("birthday"));
//        }
//        // 关闭连接
//        resultSet.close();
//        statement.close();
//        connection.close();
//    }
//}