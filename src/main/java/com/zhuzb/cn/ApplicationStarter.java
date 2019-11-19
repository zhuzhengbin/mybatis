package com.zhuzb.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @project: com.zhuzb.cn
 * @class: ApplicationStarter
 * @author: zhuzb
 * @date: 2019/11/19 9:12
 * @Version 0.0.1
 * @description: 略。
 */
// SpringBootApplication注解来自spring-boot-starter-web包
@SpringBootApplication
public class ApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }
}
