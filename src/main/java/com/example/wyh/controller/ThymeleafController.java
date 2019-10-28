package com.example.wyh.controller;

import com.example.wyh.common.PageParam;
import com.example.wyh.model.Account;
import com.example.wyh.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @Autowired
    AccountService accountService;

    @GetMapping("/{pageNum}/{pageSize}")
    public String searchAll(Model model, @PathVariable("pageNum")int pageNum,@PathVariable("pageSize")int pageSize,PageParam<Account> pageParam,Account account){
        pageParam.setPageNum(pageNum);
        pageParam.setPageSize(pageSize);
        pageParam.setOrderParams(new String[]{});
        PageHelper.startPage(pageNum, pageSize);
        List<Account> accountList = accountService.searchAllAccount(account);
        PageInfo<Account> pageInfo = new PageInfo<>(accountList);
        model.addAttribute("accountList",pageInfo.getList());
        return "accountList";
    }

    @PostMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        accountService.delete(id);
        return "redirect:/accountList";
    }

    @RequestMapping("/goAdd")
    public String goAdd(){
        return "addAccount";
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestBody Account account){
        accountService.insert(account);
        return "redirect:/accountList";
    }

    @RequestMapping("/goUpdate")
    public String goUpdate(Model model, Integer id){
        Account account = accountService.searchById(id);
        model.addAttribute("account", account);
        return "updateAccount";
    }

    @PutMapping("/updateAccount")
    public String updateAccount(Account account){
        accountService.update(account);
        return "redirect:/accountList";
    }
}
