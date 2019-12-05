package com.buba.controller;

import com.buba.pojo.Dept;
import com.buba.service.DepartClientServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DepartClientServcie service;


    @PostMapping(value="/dept")
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }
    @GetMapping(value="/dept/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        System.out.println(id);
        return service.get(id);
    }

    @GetMapping(value="/dept")
    public List list() {
         return service.list();
    }
}

