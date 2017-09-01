package com.iqmsoft.payara.appserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author keuller.magalhaes at gmail.com
 * @version 1.0
 */
@SpringBootApplication
public class PayaraMicroSpringBootApp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PayaraMicroSpringBootApp.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(PayaraMicroSpringBootApp.class, args);
    }
    
}
