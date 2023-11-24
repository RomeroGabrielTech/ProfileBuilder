package com.techtest.config; // Asegúrate de que el nombre del paquete coincida con tu estructura

import org.springframework.security.config.annotation.web.builders
    .HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .authorizeRequests()
        .antMatchers("/api/users/register").permitAll()
        .anyRequest().authenticated()
        .and()
        .httpBasic();
  }
}

