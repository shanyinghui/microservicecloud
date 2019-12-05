package com.buba.mapper;

import com.buba.pojo.Dept;

import java.util.List;

public interface DeptMapper {
   boolean addDept(Dept dept);

   Dept findById(Long id);

   List findAll();
}
