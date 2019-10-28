package com.example.wyh.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

import java.util.List;

@Data
public class Account implements Serializable{

    @ApiModelProperty(value = "账户ID",name = "id")
    @NotNull
    private Integer id;

    @ApiModelProperty(value = "账户姓名",name = "name")
    private String name;

    @ApiModelProperty(value = "账户金额",name = "money")
    @DecimalMax(value = "3000")
    private String money;

    static private List<Account> accountList;
    /*static {
        accountList = new ArrayList<>();
        Account account = new Account();
        account.setId(1);
        account.setName("rose");
        account.setMoney("100");

        accountList.add(account);
    }

    public static List<Account> getAccountList() {
        return accountList;
    }*/
}
