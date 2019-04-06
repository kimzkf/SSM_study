package cn.zkf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web控制器
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {
    /**
     * 查询所有用户信息
     *
     * @return
     */
    @RequestMapping(path = "/findAll")
    public String findAll() {
        System.out.println("findAll.....");
        return "success";
    }
}
