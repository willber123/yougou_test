package com.springboot_demo.springbootdemo.pojo;

import lombok.Data;

@Data
public class Client {
    private Long id;

    private String clientName;

    private String clientCname;

    private String clientEmail;

    private String productType;
}
