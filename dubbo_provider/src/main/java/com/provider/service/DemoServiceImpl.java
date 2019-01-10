package com.provider.service;

import com.api.service.DemoService;

public class DemoServiceImpl  implements DemoService {
    public String sayHello(String name) {
        System.out.println("Someone is calling...");
        return "Hello "+name;
    }
}
