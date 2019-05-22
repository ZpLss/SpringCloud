package com.test.service;

import com.test.entitys.Depts;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liwk
 * Date:2018/9/22 12:49
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {

    @Override
    public DeptService create(Throwable t){
        return new DeptService() {
            @Override
            public List<Depts> findAll() {
                return null;
            }

            @Override
            public Depts getDept(Long id) {
                Depts depts = new Depts();
                depts.setDb_source("no this database in mysql");
                depts.setDeptno(id);
                depts.setDname("该" + id + "没有在数据库中查询出来1");
                return depts;
            }
        };
    }

}
