package org.tcp.gesipan.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcp.gesipan.domain.Account;
import org.tcp.gesipan.mapper.AccountMapper;
import org.tcp.gesipan.repository.AccountRepository;

@Slf4j
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public Boolean checkLogin(Account account) {
        log.info("entered checkLogin method : " + account.toString());
        String testPassword = accountMapper.getValidation(account.getEmail());
        log.info(testPassword);
        if (account.getPassword().equals(testPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
