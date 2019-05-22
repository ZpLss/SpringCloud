package com.test.controller;

import com.test.entitys.Depts;
import com.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * Created by liwk
 * Date:2018/9/20 19:37
 */

@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping("/feign")
    public List<Depts> findAll(){
        return service.findAll();
    }

    @RequestMapping("/getDept")
    public Depts getDept(@RequestParam("id") Long id){
        return service.getDept(id);
    }
}
