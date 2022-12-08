package com.spring.research.embed.tomcat.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FirstAspect {

	@Before("execution(* beanATargetMethod())")
	public void firstAdvice(){
		System.out.println("FirstAspect + firstAdvice");
	}

	@After("execution(* beanBTargetMethod())")
	public void secondAdvice(){
		System.out.println("FirstAspect + secondAdvice");
	}
}
