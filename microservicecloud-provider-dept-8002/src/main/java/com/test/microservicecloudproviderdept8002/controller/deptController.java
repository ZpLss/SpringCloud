package com.test.microservicecloudproviderdept8002.controller;

import com.test.entitys.Depts;
import com.test.microservicecloudproviderdept8002.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liwk
 * Date:2018/9/17 17:47
 */
@RestController
public class deptController {


    @Autowired
    private DeptMapper deptMapper;

    @RequestMapping("/provider/dept/findAll")
    public List<Depts> findAll(){
        return deptMapper.findAll();
    }
}
