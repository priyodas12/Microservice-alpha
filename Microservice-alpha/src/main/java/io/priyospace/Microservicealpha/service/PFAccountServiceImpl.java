package io.priyospace.Microservicealpha.service;

import io.priyospace.Microservicealpha.model.PFAccount;
import io.priyospace.Microservicealpha.repository.PFAccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PFAccountServiceImpl implements PFAccountService{

    private static final Logger log= LoggerFactory.getLogger(PFAccountServiceImpl.class);

    @Autowired
    private PFAccountRepository pfAccountRepository;

    @Override
    public PFAccount saveDetails(PFAccount pfAccount) {
        log.info("saveDetails() executed...{}",pfAccount.getId());
        return pfAccountRepository.save(pfAccount);
    }
}
