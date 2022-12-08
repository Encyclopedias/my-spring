package com.spring.research.embed.tomcat.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProxyBeanA {
	@Autowired
	private ProxyBeanB proxyBeanB;

	public ProxyBeanA(){
		System.out.println("ProxyBeanA + Construct");
	}


	public void beanATargetMethod(){
		System.out.println("ProxyBeanA + beanATargetMethod");
	}
}
