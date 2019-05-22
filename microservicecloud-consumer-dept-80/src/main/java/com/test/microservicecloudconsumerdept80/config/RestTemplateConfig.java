package com.test.microservicecloudconsumerdept80.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liwk
 * Date:2018/9/17 18:44
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 提供了多种便捷访问远程http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用户访问rest服务的客户端模板工具集
     *
     *
     * 使用restTemplate访问restful接口非常的简单
     * (url, requestMap, ResponseBane.class)代表Rest请求地址， 请求参数， Http响应转换被转换成对象类型
     */
    @Bean
    @LoadBalanced  //客户端通过rest访问微服务时自带负载均衡   SpringCloud Ribbon是基于NeFlix Ribbon实现一套客户端的负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
        //return new RoundRobinRule();   默认为轮询
        //return new RandomRule();//用我们重新选择的随机算法替代默认的轮询
        return new RetryRule();//先按照RoundRobinRule()的策略获取服务，如果获取服务失败则在执行时间内会进行重试，获取可用的服务
    }

}
