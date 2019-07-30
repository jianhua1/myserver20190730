package com.re01.jh.service.impl;


import com.re01.jh.service.IMyServer;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(
        serviceName = "MyServer",
        targetNamespace = "http://service.jh.re01.com/",
        endpointInterface = "com.re01.jh.service.IMyServer")
public class MyServerImpl implements IMyServer {
    @Override
    public String sendInfo() {
        System.out.println("eeeeeeeeeeeee");
        return "cd";
    }
}
