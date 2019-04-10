package com.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(scanBasePackages = { "com.example" })
public class JwtUnderstandingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtUnderstandingApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // @Bean
    // @Primary
    // public UserDetailsService getUserDetailsService() {
    // return new UserDetailsServiceImpl();
    // }
}
