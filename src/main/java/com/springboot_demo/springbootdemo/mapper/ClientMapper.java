package com.springboot_demo.springbootdemo.mapper;

import com.springboot_demo.springbootdemo.pojo.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    public Integer insert(Client client);
}
