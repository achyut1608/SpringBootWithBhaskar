package com.boot.banking.repository;

import com.boot.banking.entity.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bankRepository extends MongoRepository<Bank,String> {
}
