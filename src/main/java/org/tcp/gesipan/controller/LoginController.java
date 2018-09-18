package org.tcp.gesipan.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tcp.gesipan.domain.Account;
import org.tcp.gesipan.service.AccountService;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }

    @PostMapping("/login")
    public String getValidation(Account account) {
        if (accountService.checkLogin(account)) {
            log.info("aaaa");
            return "main.html";
        } else {
            return "redirect:login";
        }
    }
}
