package com.spring.cloud.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author murugan.v
 *This is the main class of spring boot application
 */

@SpringBootApplication
@EnableResourceServer
@RestController
public class SpringCloudSecurityResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSecurityResourceServerApplication.class, args);
	}
	
	Map<Integer, Account> accMap = new HashMap<>();
	
	@RequestMapping(value="/account")
	private Collection<Account> getAccountDetails(){
		
		if (ObjectUtils.isEmpty(accMap)) {
			accMap.put(12345,  new Account(12345, "saving", "Murugan", "SBI"));
			accMap.put(12346,  new Account(12346, "saving", "Vinoth", "ICICI"));
			accMap.put(12347,  new Account(12347, "current", "Sridhar", "HDFC"));
		}
		
		return accMap.values();
	}
}
