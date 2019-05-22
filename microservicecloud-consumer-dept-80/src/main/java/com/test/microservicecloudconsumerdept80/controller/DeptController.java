package com.test.microservicecloudconsumerdept80.controller;

import com.test.entitys.Depts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liwk
 * Date:2018/9/17 18:45
 */
@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

//  private final String URL = "http://localhost:8001/";

    //通过微服务名字从eureka上找到并访问
    //Eureka和Ribbon整合后消费端可以不在关心ip地址和端口号
    private final String URL = "http://MICROSERVICECLOUD-PROVIDER-DEPT/";

    @RequestMapping("consumer/list")
    public List<Depts> findAll(){
        return restTemplate.getForObject(URL + "/provider/dept/findAll", List.class);
    }


}
