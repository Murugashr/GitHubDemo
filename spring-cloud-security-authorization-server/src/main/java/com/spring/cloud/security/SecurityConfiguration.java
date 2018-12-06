package com.spring.cloud.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.init(auth);
		
		auth
			.inMemoryAuthentication()
			.withUser("murugan")
			.password("pass")
			.roles("USER")
			.and()
			.withUser("vinoth").password("pass").roles("USER", "ADMIN");
	}

	
}
