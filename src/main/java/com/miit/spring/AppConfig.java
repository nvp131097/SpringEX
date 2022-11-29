package com.miit.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//we can use multiple package using comma in @ComponentScan
@ComponentScan("com.miit.spring")
public class AppConfig {

}
