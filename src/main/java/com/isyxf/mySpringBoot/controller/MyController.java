package com.isyxf.mySpringBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @Value("${mall.config.name}")
    private String name;
    @Value("${mall.config.description}")
    private String description;
    @Value("${mall.config.hot-sales}")
    private Integer hotSales;
    @Value("${mall.config.show-advert}")
    private Boolean showAdvert;

    @RequestMapping("/out/{id}")
    @ResponseBody
    public String out(@PathVariable String id) {
        return "success" + id;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info() {
        logger.info("这是个是测试");

        return String.format("name:%s,description:%s,hot-sales:%s,show-advert:%s",
                name, description, hotSales, showAdvert);
    }


}
