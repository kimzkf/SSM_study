package cn.zkf.dao;

import cn.zkf.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

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
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
