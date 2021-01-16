package com.example.demo.spider.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@EqualsAndHashCode
@ToString
public class JianwenItemsDto {
    private String article;
    private List<String> channels;
    private String content;
    private String content_more;
    private String content_text;
    private Date display_time;
    private String global_channel_name;
    private String global_more_uri;
    private String id;
    private String is_calendar;
    private String is_favourite;
    private String is_priced;
    private String is_scaling;
    private String reference;
    private String related_themes;
    private Integer score;
    private List<String> symbols;
    private List<String> tags;
    private String title;
    private String type;

}
