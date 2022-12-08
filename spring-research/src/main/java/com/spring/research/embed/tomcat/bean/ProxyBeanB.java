package com.spring.research.embed.tomcat.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxyBeanB {
	@Autowired
	private ProxyBeanA proxyBeanA;

	public ProxyBeanB(){
		System.out.println("ProxyBeanB + Construct");
	}

	public void beanBTargetMethod(){
		System.out.println("ProxyBeanB + beanBTargetMethod");
	}
}
