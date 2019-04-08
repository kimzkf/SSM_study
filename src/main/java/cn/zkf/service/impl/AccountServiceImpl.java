package cn.zkf.service.impl;

import cn.zkf.dao.AccountDao;
import cn.zkf.domain.Account;
import cn.zkf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    //Autowired:自动装配
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户信息。。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户信息。。。");
       accountDao.saveAccount(account);
    }
}
