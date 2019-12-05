package com.buba.service;

import com.buba.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List list();
}
