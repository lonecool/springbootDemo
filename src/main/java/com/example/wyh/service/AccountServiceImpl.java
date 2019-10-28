package com.example.wyh.service;

import com.example.wyh.dao.AccountDao;
import com.example.wyh.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public int insert(Object o) {
        return accountDao.addAccount((Account) o);
    }

    @Override
    public int delete(Integer id) {
        return accountDao.removeAccoutById(id);
    }

    @Override
    public int update(Object o) {
        return accountDao.updateAccount((Account) o);
    }

    @Override
    public List<Account> query(Object o) {
        return null;
    }
    @Override
    public List<Account> searchAllAccount(Account account) {
        return accountDao.searchAllAccount(account);
    }

    @Override
    public Account searchById(Integer id) {
        return accountDao.searchById(id);
    }

    public int deleteById(Integer id) {
        return accountDao.removeAccoutById(id);
    }
}
