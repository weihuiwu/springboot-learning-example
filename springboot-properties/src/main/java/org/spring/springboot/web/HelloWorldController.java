package org.spring.springboot.web;

import org.spring.springboot.property.HomeProperties;
import org.spring.springboot.property.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    @Autowired
    HomeProperties homeProperties;
    @Autowired
    UserProperties userProperties;

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/home")
    public String handlerHome() {
        return homeProperties.toString();
    }

    @RequestMapping("/user")
    public String handlerUser() {
        return userProperties.toString();
    }
}
