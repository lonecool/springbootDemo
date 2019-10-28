package com.example.wyh.base;

import com.example.wyh.model.Account;

import java.util.List;

public interface ServiceBase<T> {
    int insert(T t);

    int delete(Integer id);

    int update(T t);

    List<Account> query(T t);
}
