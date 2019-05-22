package com.text.microservicecloudproviderdept8001.controller;

import com.test.entitys.Depts;
import com.text.microservicecloudproviderdept8001.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @RequestMapping("/provider/dept/getDept")
    public Depts getDept(@RequestParam("id") Long id){
        Depts depts = deptMapper.getDept(id);
        return depts;
    }
}
