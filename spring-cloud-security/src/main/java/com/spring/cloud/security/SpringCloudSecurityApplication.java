package com.spring.cloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * @author murugan.v
 * This is main application of spring
 * security cloud project
 * 
 */
@SpringBootApplication
//@EnableOAuth2Sso
public class SpringCloudSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityApplication.class, args);
	}
}
