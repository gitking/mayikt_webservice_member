package com.mayikt.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class UserService {
	@WebMethod
	public String getUser(long userId) {
		return "每特教育牛逼+" + userId;
	}
	public static void main(String[] args) {
		//直接启动main方法
		//发布我们的WebService接口,发布成功之后可以在页面上访问:http://127.0.0.1:8089/service/UserService?wsdl
		Endpoint.publish("http://127.0.0.1:8089/service/UserService", new UserService());
		System.out.println("服务发布成功");
	}
}
