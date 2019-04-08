package cn.zkf.controller;

import cn.zkf.domain.Account;
import cn.zkf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 账户web控制器
 */
@Controller
@RequestMapping(path = "/account")
public class AccountController {
    /**
     * Autowired:自动注入,装配
     */
    @Autowired
    private AccountService accountService;

    /**
     * 查询所有用户信息
     *
     * @return
     */
    @RequestMapping(path = "/findAll")
    public String findAll(Model model) {
        System.out.println("findAll.....");

        //调用service方法
        List<Account> accountList=accountService.findAll();

        model.addAttribute("accountList",accountList);
        return "success";
    }
    /**
     * 保存用户信息
     *
     * @return
     */
    @RequestMapping(path = "/saveAccount")
    public void findAll(Account account, HttpServletRequest request, HttpServletResponse response) throws  Exception {
        System.out.println("saveAccount.....");

        //调用service方法
        accountService.saveAccount(account);

        //重定向
        response.sendRedirect(request.getContextPath() + "/account/findAll");
        return;
    }
}
