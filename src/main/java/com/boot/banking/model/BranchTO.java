package com.boot.banking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
public class BranchTO {

    private int branchId;
    private String branchAddress;

}
