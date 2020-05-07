package io.priyospace.Microservicealpha.controller;

import io.priyospace.Microservicealpha.model.Currency;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "currency")
public class CurrencyController {

    Map<String, Currency> currencyList=new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Currency> getCurrencyDetails(){
        return currencyList;
    }

    @ReadOperation
    public Currency getCurrency(@Selector String type) {
        return currencyList.get(type);
    }

    @WriteOperation
    public void setCurrency(@Selector String type,int currency) {
        currencyList.put(type,new Currency(currency));
    }
}
