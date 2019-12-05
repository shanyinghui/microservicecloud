package com.buba.service.Impl;

import com.buba.mapper.DeptMapper;
import com.buba.pojo.Dept;
import com.buba.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServcieImpl implements DeptService {

    @Autowired
    private DeptMapper mapper;

    @Override
    public boolean add(Dept dept) {
        return mapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return mapper.findById(id);
    }

    @Override
    public List list() {
        return mapper.findAll();
    }
}
