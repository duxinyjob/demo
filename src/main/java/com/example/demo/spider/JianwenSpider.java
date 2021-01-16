package com.example.demo.spider;

import com.example.demo.spider.dto.JianwenDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class JianwenSpider {

    @Autowired
    private RestTemplate restTemplate ;

    private Integer pageNo = 1;

    private Integer limit = 20;

    public JianwenSpider() {
        start();
    }

    public void start(){

        StringBuilder url = new StringBuilder("https://api.wallstcn.com/apiv1/search/live?");
        url.append("cursor=" + pageNo);
        url.append("&channel=global-channel&score=2");
        url.append("&limit=" + limit);
//        JianwenDto result =  restTemplate.getForEntity(url.toString());
//        System.out.println(result);
    }
}
