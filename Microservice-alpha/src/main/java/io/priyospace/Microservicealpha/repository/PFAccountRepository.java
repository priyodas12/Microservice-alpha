package io.priyospace.Microservicealpha.repository;

import io.priyospace.Microservicealpha.model.PFAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface PFAccountRepository  extends JpaRepository<PFAccount,Integer> {
    //PFAccount save(PFAccount pfAccount);
}
