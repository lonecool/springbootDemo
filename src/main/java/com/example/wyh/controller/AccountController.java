package com.example.wyh.controller;

import com.example.wyh.base.ResponseBase;
import com.example.wyh.common.PageParam;
import com.example.wyh.model.Account;
import com.example.wyh.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Api(value = "account",description = "这是对account进行的操作")
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/query")
    public Object query(Account account) {
        return ResponseBase.success(accountService.query(account));
    }

    @PostMapping("/searchAllAccount")
    public Object searchAllAccount(@RequestBody PageParam<Account> pageParam) {
        PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());
        for(int i=0;i<pageParam.getOrderParams().length;i++){
            PageHelper.orderBy(pageParam.getOrderParams()[i]);
        }
        List<Account> accountList = accountService.searchAllAccount(pageParam.getModel());
        PageInfo<Account> pageInfo = new PageInfo<Account>(accountList);
        return pageInfo;
    }
    @PutMapping
    public Object update(@RequestBody @Valid Account account) {
        return ResponseBase.success(accountService.update(account));
    }
    @PostMapping
    public Object insert(@RequestBody @Valid Account account) {
        return ResponseBase.success(accountService.insert(account));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        return ResponseBase.success(accountService.delete(id));
    }

    /*@RequestMapping(value = "/showProfileActive",method = RequestMethod.GET)
    public Object showProfileActive(){
        throw new ArithmeticException();
    }*/
    @Cacheable(value = "accounts",key = "#p0")
    @GetMapping("/searchById/{id}")
    public Object searchById(@PathVariable("id") Integer id){
        log.info("走的是数据库");
       return ResponseBase.success(accountService.searchById(id));
    }
}
