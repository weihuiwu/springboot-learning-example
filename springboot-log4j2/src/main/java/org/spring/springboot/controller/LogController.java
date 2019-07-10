package org.spring.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/log")
    public String logHandler(){
        logger.info("测试info日志打印:[{}]","info test");
        logger.warn("测试warn日志打印:[{}]","warn test");
        logger.error("测试error日志打印:[{}]","error test");
        return "logger test";
    }
}
