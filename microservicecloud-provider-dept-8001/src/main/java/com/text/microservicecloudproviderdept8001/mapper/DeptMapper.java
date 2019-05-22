package com.text.microservicecloudproviderdept8001.mapper;

import com.test.entitys.Depts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liwk
 * Date:2018/9/17 17:31
 */
@Mapper
@Component
public interface DeptMapper {

    public List<Depts> findAll();


    public Depts getDept(@Param("id") Long id);
}
