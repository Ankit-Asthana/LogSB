package com.ankit.log.controller;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    private static final Logger log = Logger.getLogger(MyController.class);

//      instance initializer block
//    {
//        BasicConfigurator.configure();
//    }

    @GetMapping("/")
    public String get(){
        log.debug("Loading index page");
        log.info("Info level mesage");
        log.warn("Warn level message");
        log.error("Error level message");
        log.fatal("Fatal level message");
        log.trace("Trace level message");
        log.debug("Exit of index().");
        return "logged";
    }
}
