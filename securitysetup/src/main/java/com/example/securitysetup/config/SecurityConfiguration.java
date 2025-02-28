package com.example.securitysetup.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
		
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception {
return http	
		.csrf(Customizer -> Customizer.disable())
		.authorizeHttpRequests(request->request.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.build();
	}
	
	@Bean
	public UserDetailsService userdetailservice() {
		UserDetails user = User
			.withUsername("gowtham")
			.password("{noop}gmr2001")
			.roles("USER")
				.build();
	return new InMemoryUserDetailsManager(user);
	}
	

}
