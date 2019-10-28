package com.example.wyh.service;

import com.example.wyh.base.ServiceBase;
import com.example.wyh.model.Account;

import java.security.AccessControlContext;
import java.util.List;

public interface AccountService extends ServiceBase{
    List<Account> searchAllAccount(Account account);

    Account searchById(Integer id);
}
