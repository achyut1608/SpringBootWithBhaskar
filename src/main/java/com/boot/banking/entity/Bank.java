package com.boot.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@ToString
@Document(collection = "bank")
public class Bank {
    @Indexed
    @Id
    private String id;

    @Field("bankCode")
    private int bankCode;

    @Field("bankName")
    private String bankName;

    @Field("bankAddress")
    private String bankAddress;
}
