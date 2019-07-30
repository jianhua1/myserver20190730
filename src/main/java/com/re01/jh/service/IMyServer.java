package com.re01.jh.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name="IMyServer",targetNamespace = "http://service.jh.re01.com/")
public interface IMyServer {
@WebMethod
   String sendInfo();
}
