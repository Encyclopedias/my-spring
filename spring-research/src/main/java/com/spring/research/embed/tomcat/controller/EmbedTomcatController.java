package com.spring.research.embed.tomcat.controller;

import com.spring.research.embed.tomcat.bean.ProxyBeanA;
import com.spring.research.embed.tomcat.bean.ProxyBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmbedTomcatController {

	@Autowired
	private ProxyBeanA proxyBeanA;
	@Autowired
	private ProxyBeanB proxyBeanB;
	@RequestMapping("/hello/test")
	@ResponseBody
	public String helloWorld() {
		proxyBeanA.beanATargetMethod();
		proxyBeanB.beanBTargetMethod();
		return "hello world";
	}
}
