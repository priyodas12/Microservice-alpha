package io.priyospace.Microservicealpha.controller;

import io.priyospace.Microservicealpha.model.PFAccount;
import io.priyospace.Microservicealpha.service.PFAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PFAccountController {

    @Autowired
    private PFAccountService pfAccountService;

    @RequestMapping(value = "/pfs",method = RequestMethod.POST)
    public PFAccount saveDetails(@RequestBody PFAccount pfAccount){
        return pfAccountService.saveDetails(pfAccount);
    }
}
