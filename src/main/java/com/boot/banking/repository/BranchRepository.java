package com.boot.banking.repository;

import com.boot.banking.entity.Bank;
import com.boot.banking.entity.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BranchRepository extends MongoRepository<Branch,String> {
}
