package com.springboot_demo.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot_demo.springbootdemo.AnnotationUtil.FromJson;
import com.springboot_demo.springbootdemo.mapper.ClientMapper;
import com.springboot_demo.springbootdemo.pojo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {
      @Autowired
    private ClientMapper clientMapper;

      @RequestMapping(value = "insert", method = {RequestMethod.POST})
      @ResponseBody
    public Integer  insert(@RequestBody String json){
          Client client = JSONObject.parseObject(json, Client.class);
          Integer insert = clientMapper.insert(client);
          return insert;
      }
}
