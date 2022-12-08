package com.spring.research.embed.tomcat.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.spring.research.embed.tomcat")
@Configuration
public class AppConfig {

}
