package com.test.service;

import com.test.entitys.Depts;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * Created by liwk
 * Date:2018/9/20 19:09
 */
//@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER-DEPT", fallbackFactory = DeptServiceFallbackFactory.class)
@Component
public interface DeptService {

    @RequestMapping("/provider/dept/findAll")
    public List<Depts> findAll();

    @RequestMapping("/provider/dept/getDept")
    public Depts getDept(@RequestParam("id") Long id);
}
