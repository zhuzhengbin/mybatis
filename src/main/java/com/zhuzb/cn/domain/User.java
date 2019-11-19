package com.zhuzb.cn.domain;

import lombok.Data;

import java.sql.Date;

/**
 * @project: com.zhuzb.cn.domain
 * @class: User
 * @author: zhuzb
 * @date: 2019/11/19 11:10
 * @Version 0.0.1
 * @description: 略。
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;
    private Double height;
}
