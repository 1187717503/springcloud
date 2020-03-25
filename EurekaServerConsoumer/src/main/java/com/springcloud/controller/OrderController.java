package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jason
 * @version 1.0
 * @date 2020/3/25 16:22
 */
@RestController
public class OrderController {
    @Autowired
    private RestTemplate getRestTemplate;


}
