package io.priyospace.Microservicealpha.controller;

import io.priyospace.Microservicealpha.model.PFAccount;
import io.priyospace.Microservicealpha.service.PFAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PFAccountController {

    @Autowired
    private PFAccountService pfAccountService;

    @RequestMapping(value = "/pfs",method = RequestMethod.POST)
    public PFAccount saveDetails(@RequestBody PFAccount pfAccount){
        return pfAccountService.saveDetails(pfAccount);
    }

    @RequestMapping(value = "/pfs/{id}",method = RequestMethod.GET)
    public ResponseEntity<PFAccount> fetchPFAccountById(@PathVariable int id){

        PFAccount pf=pfAccountService.fetchRecordByID(id);
        if(pf==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok().body(pf);
        }
    }
}
