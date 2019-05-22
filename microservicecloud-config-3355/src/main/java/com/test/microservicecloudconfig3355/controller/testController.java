package com.test.microservicecloudconfig3355.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwk
 * Date:2018/9/25 19:24
 */
@RestController
public class testController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @Value("${spring.profiles}")
    private String profiles;


    @RequestMapping("/config")
    public String config(){
        return applicationName + "\n" + port + "\n" + profiles;
    }

}
