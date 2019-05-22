package com.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.entitys.Depts;
import com.test.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.invoke.empty.Empty;

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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Depts getDept(@RequestParam("id") Long id){
        Depts depts = deptMapper.getDept(id);
        if(null == depts){
            throw new RuntimeException("该 " + id + "没有对应的信息");
        }
        return depts;
    }


    public Depts processHystrix_Get(Long id){
        Depts depts = new Depts();
        depts.setDeptno(id);
        depts.setDname("该 " + id + "没有对应的信息");
        depts.setDb_source("no this database in mysql");
        return depts;
    }
}
