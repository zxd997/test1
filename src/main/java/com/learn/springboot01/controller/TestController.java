package com.learn.springboot01.controller;

//import com.learn.springboot01.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = {"classpath:jdbc.properties","classpath:main1/wo.properties"})
public class TestController {
    Logger log=LoggerFactory.getLogger(TestController.class);
//    @Autowired
//    TestConfig testConfig;
    @Value("${name.aaa}")
    private String name;
    @RequestMapping("/a")
    public String getMsg(){
        return name;
    }
}
