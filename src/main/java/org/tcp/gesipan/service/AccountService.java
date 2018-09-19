package org.tcp.gesipan.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcp.gesipan.domain.Account;
import org.tcp.gesipan.repository.AccountMapper;

@Slf4j
@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public Boolean checkLogin(Account account) {
        log.info("entered checkLogin method : " + account.toString());
        Account validateAccount = accountMapper.findByEmail(account.getEmail());
        log.info(validateAccount.getPassword());
        if (account.getPassword().equals(validateAccount.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
