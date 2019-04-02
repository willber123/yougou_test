package com.springboot_demo.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix="person")
public class DemoController {
   // @Value("${person.name}")
     private String name;
     // @Value("${person.age}")
    private  String age;
    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "springboot 访问成功! name=" + name + ",age=" + age;
    }

   public void setName(String name){
        this.name=name;
   }
   public void setAge(String age){
        this.age=age;
   }
}
