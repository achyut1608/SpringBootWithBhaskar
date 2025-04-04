package com.boot.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
public class Loan {
    @Id
    @Indexed
    private String id;

    @Field("loanId")
    private int loanId;

    @Field("loanAmount")
    private int loanAmount;

    @Field("loanType")
    private String loanType;
}
