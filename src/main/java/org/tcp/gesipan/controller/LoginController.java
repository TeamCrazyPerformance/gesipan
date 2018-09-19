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
    public String getLogin(Account account) {
        if (accountService.checkLogin(account)) {
            log.info("check success");
            return "index.html";
        } else {
            log.info("check failed");
            return "index.html";
        }
    }
}
