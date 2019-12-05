package com.buba.controller;

import com.buba.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://microservicecloud-dept";

    @PostMapping(value="/dept")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept", dept, Boolean.class);
    }
    @GetMapping(value="/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        System.out.println(1);
        if(id.equals(1)){
            throw new RuntimeException("太忙了");
        }
     //   restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+id, Dept.class)
       return null;
    }

    @GetMapping(value="/dept")
    public List list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept", List.class);
    }
}

