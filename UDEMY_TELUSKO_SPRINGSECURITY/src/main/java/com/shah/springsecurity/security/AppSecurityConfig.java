package com.shah.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.shah.springsecurity.service.UserInfoDetailsService;

@Configuration
@EnableWebSecurity
// @EnableMethodSecurity // used for method based authorization
public class AppSecurityConfig{


	// used for authentication
	/*@Bean
	public UserDetailsService userDetailService(PasswordEncoder encoder) {
		UserDetails admin = User.withUsername("Test")
							.password(encoder.encode("test"))
							.roles("ADMIN").build();
		UserDetails user = User.withUsername("abc")
							.password(encoder.encode("test"))
							.roles("USER","ADMIN","HR").build();
		
		return new InMemoryUserDetailsManager(admin,user);
	}*/

	@Bean
	public UserDetailsService userDetailService() {
		return new UserInfoDetailsService();
	}
	
	@Bean
	@SuppressWarnings("removal")
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.csrf().disable()
				.authorizeHttpRequests()
				.requestMatchers("/all","/addUser","/getHome").permitAll()
				.and()
				//.authorizeHttpRequests().requestMatchers("").hasRole("ADMIN").and()
				.formLogin().and().build();
	}
	
	// used for password encryption 
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}
	
}
