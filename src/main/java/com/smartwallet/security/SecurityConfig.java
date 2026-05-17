package com.smartwallet.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration//this class contain configuration settings

//This class controls ->who can access which apis and which security filters execute
public class SecurityConfig {

    private final JwtFilter jwtFilter;
  //constructor injection
    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http)
        throws Exception {

    http
        .csrf(csrf -> csrf.disable())
         .authorizeHttpRequests(auth -> auth

    .requestMatchers("/api/auth/login").permitAll()

    .requestMatchers("/api/users/register").permitAll()

    .requestMatchers("/api/transactions/**").authenticated()

    .anyRequest().permitAll()
)
        .addFilterBefore(jwtFilter,
            UsernamePasswordAuthenticationFilter.class);

    return http.build();
}
}