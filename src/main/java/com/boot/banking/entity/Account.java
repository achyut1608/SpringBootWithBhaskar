package com.boot.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@ToString
@Document(collection = "account")
public class Account {
    @Indexed
    @Id
    private String id;

    @Field("accountNo")
    private String accountNo;

    @Field("accountType")
    private String accountType;

    @Field("balance")
    private double balance;
}
