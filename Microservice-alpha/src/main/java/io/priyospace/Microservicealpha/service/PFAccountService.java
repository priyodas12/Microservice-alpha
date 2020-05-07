package io.priyospace.Microservicealpha.service;

import io.priyospace.Microservicealpha.model.PFAccount;


public interface PFAccountService {
        PFAccount saveDetails(PFAccount pfAccount);
        public PFAccount fetchRecordByID(int id);
}
