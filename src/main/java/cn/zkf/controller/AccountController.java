package cn.zkf.controller;

import cn.zkf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web控制器
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {
    /**
     * Autowired:自动注入
     */
    @Autowired
    private AccountService accountService;

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @RequestMapping(path = "/findAll")
    public String findAll() {
        System.out.println("findAll.....");
        accountService.findAll();
        //调用service方法


        return "success";
    }
}
