package com.idcmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//多数据源时用exclude去除默认配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class IdcMisApplication {
    public static void main(String[] args) {
        SpringApplication.run(IdcMisApplication.class, args);
    }
}