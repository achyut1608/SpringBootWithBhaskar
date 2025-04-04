package com.boot.banking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
public class AccountTO {

    private String accountType;
    private double balance;
}
