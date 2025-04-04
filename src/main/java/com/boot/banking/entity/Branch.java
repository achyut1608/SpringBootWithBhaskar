package com.boot.banking.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@Setter
@ToString
@Document(collection = "branch")
public class Branch {

    @Id
    @Indexed
    private String id;

    @Field("branchId")
    private int branchId;

    @Field("branchAddress")
    private String branchAddress;

    @Field("branchName")
    private String branchName;
}
