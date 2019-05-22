package com.test.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by liwk
 * Date:2018/9/17 17:09
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depts implements java.io.Serializable {
    private Long deptno;
    private String dname;
    private String db_source;


}
