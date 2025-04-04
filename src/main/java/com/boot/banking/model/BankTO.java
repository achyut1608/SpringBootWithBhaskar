package com.boot.banking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@ToString
public class BankTO {

    private String bankName;
    private String bankAddress;

}
