package com.richasdy.springwebauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/").setViewName("authentication/login");
    	registry.addViewController("/login").setViewName("authentication/login");
    	registry.addViewController("/register").setViewName("authentication/register");
        registry.addViewController("/dashboard").setViewName("dashboard/index");
    }

}
