package com.buba.service;

import com.buba.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DepartClientServcie> {
    @Override
    public DepartClientServcie create(Throwable throwable) {
        return new DepartClientServcie() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
               Dept dept =  new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dept.setDb_source("no this database in MySQL");
                return dept;

            }

            @Override
            public List list() {
               return null;
            }
        };
    }
}
