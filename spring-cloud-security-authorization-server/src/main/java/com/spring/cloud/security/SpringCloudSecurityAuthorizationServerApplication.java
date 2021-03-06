package com.spring.cloud.security;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SpringCloudSecurityAuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityAuthorizationServerApplication.class, args);
	}
}
