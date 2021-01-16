package com.example.demo.spider;

import com.alibaba.fastjson.JSON;
import com.example.demo.spider.dto.JianwenDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class JianwenSpider {

    @Autowired
    private RestTemplate restTemplate;

    private Integer pageNo = 1;

    private Integer limit = 20;

    @Scheduled(fixedDelay = 3000)
    public void start(){

        log.info("定时任务开启");
        StringBuilder url = new StringBuilder("https://api.wallstcn.com/apiv1/search/live?");
        url.append("cursor=" + pageNo);
        url.append("&channel=global-channel&score=2");
        url.append("&limit=" + limit);
        String result = restTemplate.getForObject(url.toString(),String.class);
        System.out.println(result);
        JianwenDto jianwenDto = JSON.parseObject(result,JianwenDto.class);
        log.info("定时任务结束");
    }


}
