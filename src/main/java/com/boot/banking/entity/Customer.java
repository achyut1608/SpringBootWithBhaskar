package com.boot.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Setter
@Getter
@ToString
@Document(collection = "customer")
public class Customer {

    @Id
    @Indexed
    private String id;

    @Field("customerId")
    private int customerId;

    @Field("customerName")
    private String customerName;

    @Field("customerAddress")
    private String customerAddress;

    @Field("customerContactNumber")
    private long customerContactNumber;

}
