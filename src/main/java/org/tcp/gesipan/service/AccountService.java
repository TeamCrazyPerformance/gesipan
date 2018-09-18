package org.tcp.gesipan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tcp.gesipan.domain.Account;
import org.tcp.gesipan.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Boolean checkLogin(Account account) {
        String testPass = "1234";
        Account testAccount = accountRepository.getAccount(account.getEmail());
        if (account.getPassword().equals(testAccount.getPassword()))
            return true;
        else
            return false;
    }
}
