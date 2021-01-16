package com.example.demo;

import com.example.demo.spider.BaiduSpider;
import com.example.demo.spider.JianwenSpider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableTransactionManagement
@MapperScan("com.example.demo.dao")
@EnableScheduling
@EnableCaching
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        JianwenSpider jianwenSpider = new JianwenSpider();
    }

}
