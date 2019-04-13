package com.learn.springboot01.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:jdbc.properties","classpath:main1/wo.properties"})
public class TestConfig {
    @Value("${name.aaa}")
    public String name;
    @Value("${age}")
    public int age;
    @Value("${price}")
    public String price;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
