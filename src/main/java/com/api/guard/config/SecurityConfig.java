package com.api.guard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    public SecurityFilterChain filterChain(HttpSecurity httpsecurity) throws Exception {
        httpsecurity.authorizeRequests().anyRequest().permitAll();
        return httpsecurity.build();
    }
}