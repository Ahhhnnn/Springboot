package com.he.attenddemo.config;

import com.he.attenddemo.intercepter.LoginIntercepter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
@Slf4j
public class MyMvcVonfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.error("####添加拦截器####");
        registry.addInterceptor(new LoginIntercepter()).excludePathPatterns("/static/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.error("####不拦截static下的静态资源####");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
