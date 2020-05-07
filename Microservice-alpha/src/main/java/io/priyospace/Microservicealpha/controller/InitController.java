package io.priyospace.Microservicealpha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @RequestMapping(value = "/api/init",method = RequestMethod.GET)
    public String connectProjectController(){
        return "Microservice alpha responding...";
    }
}
