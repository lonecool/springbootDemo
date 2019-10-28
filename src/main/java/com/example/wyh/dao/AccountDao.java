package com.example.wyh.dao;

import com.example.wyh.model.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface AccountDao {
   @Insert("insert into account(id,name,money) values(null,#{name},#{money})")
   int addAccount(Account account);

   @Delete("delete from account where id=#{id}")
   int removeAccoutById(int id);

   /*@Select("select * from account")*/
   List<Account> searchAllAccount(Account account);

   @Update("update account set name=#{name},money=#{money} where id=#{id}")
   int updateAccount(Account account);


    Account searchById(Integer id);
}
