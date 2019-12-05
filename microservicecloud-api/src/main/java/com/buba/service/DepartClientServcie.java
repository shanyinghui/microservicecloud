package com.buba.service;

import com.buba.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value="microservicecloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DepartClientServcie {
    @PostMapping(value="/dept")
    boolean add(Dept dept);

    @GetMapping(value="/dept/{id}")
    Dept get(@PathVariable("id") Long id);

    @GetMapping(value="/dept")
    List list();
}
