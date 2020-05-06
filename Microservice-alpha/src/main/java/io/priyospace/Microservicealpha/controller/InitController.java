package io.priyospace.Microservicealpha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @RequestMapping("/api/init")
    public String connectProjectController(){
        return "Microservice alpha responding...";
    }
}
