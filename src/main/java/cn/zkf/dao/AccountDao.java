package cn.zkf.dao;

import cn.zkf.domain.Account;

import java.util.List;

/**
 * 账户dao接口
 * mybatis可以实现，不用写实现类
 */
public interface AccountDao {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
