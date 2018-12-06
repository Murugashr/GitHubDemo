package com.spring.cloud.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpRestController {

	Map<Integer, Employee> map = new HashMap<>();

	@Autowired
	private OAuth2ClientContext clientContext;
	
	@RequestMapping(value = "/emp", method=RequestMethod.GET)
	public Collection<Employee> getEmployees(){
	
		if (ObjectUtils.isEmpty(map)) {
			map.put(1,  new Employee(1, "Murugan", 29, "tn"));
			map.put(2,  new Employee(2, "Vinoth", 27, "tn"));
			map.put(3,  new Employee(3, "Sridhar", 25, "tn"));
		}
		
		return map.values();
	}
	
	@RequestMapping(value="/token")
	public String getToken() {
		
		String token = clientContext.getAccessToken().getValue();
		System.out.println("Token " + token);
		return token;
	}
}
