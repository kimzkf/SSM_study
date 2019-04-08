package cn.zkf.test;

import cn.zkf.dao.AccountDao;
import cn.zkf.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /*
     * 测试spring的service环境
     */
    @Test
    public void testAccountMyBatis() throws Exception{
        //加载MyBatis配置文件
        InputStream in=Resources.getResourceAsStream("SqlMapConfig1.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);

        //创建SqlSession对象
        SqlSession session=factory.openSession();

        //获取到代理对象
        AccountDao accountDao=session.getMapper(AccountDao.class);

        //查询所有对象信息
       List<Account> accountList= accountDao.findAll();
        for(Account account:accountList){
            System.out.println(account);
        }
        //关闭资源
        session.close();
        in.close();
    }

    /**
     * 测试保存用户信息
     * @throws Exception
     */
    @Test
    public void testSaveAccountMyBatis() throws Exception{
        //加载MyBatis配置文件
        InputStream in=Resources.getResourceAsStream("SqlMapConfig1.xml");

        //创建SqlSessionFactory对象
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);

        //创建SqlSession对象
        SqlSession session=factory.openSession();

        //获取到代理对象
        AccountDao accountDao=session.getMapper(AccountDao.class);

        Account account=new Account();
        account.setName("小明");
        account.setMoney(500d);

        //保存
        accountDao.saveAccount(account);

        //增删改提交事务
        session.commit();

        //关闭资源
        session.close();
        in.close();
    }
}
