package com.example.demo.spider.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Setter
@Getter
@Data
@ToString
public class JianwenDto {
    private String code;
    private String message;
    private Map data;
}
