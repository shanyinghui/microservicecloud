package com.buba.controller;

import com.buba.annotation.Log;
import com.buba.pojo.Dept;
import com.buba.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptService service;

    @PostMapping(value="/dept")
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @GetMapping(value="/dept/{id}")
    @Log
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @GetMapping(value="/dept")
    public List list()
    {
        return service.list();
    }
}
