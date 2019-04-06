package cn.zkf.test;

import cn.zkf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
     //加载spring配置文件
     public static ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    //获取对象
    public static AccountService as=(AccountService) ac.getBean("accountService");
    /**
     * 测试spring的service环境
     */
    @Test
    public void testAccountSpring(){
        //调用方法
        as.findAll();
    }
}
