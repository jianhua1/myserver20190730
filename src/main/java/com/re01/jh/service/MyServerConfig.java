package com.re01.jh.service;

import com.re01.jh.service.impl.MyServerImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
//http://localhost:8080/services/api?wsdl
@Configuration
public class MyServerConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new MyServerImpl());
        endpoint.publish("/api");
        return endpoint;
    }

}
