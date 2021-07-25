package com.csw.encachedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan("com.csw.encachedemo.dao")
@EnableCaching
public class EncacheDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(EncacheDemoApp.class, args);
    }
}
