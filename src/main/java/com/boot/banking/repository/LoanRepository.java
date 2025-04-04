package com.boot.banking.repository;

import com.boot.banking.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan,String> {
}
