package org.tcp.gesipan.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.tcp.gesipan.domain.Account;

@Repository
public class AccountRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account getAccount(String email) {
        String sql = "SELECT password FROM account WHERE email = ?";
        String tempPassword = jdbcTemplate.query(sql, new Object[]{email}, (rs) -> {
            return rs.getString("password");
        });
        Account tempAccount = new Account();
        tempAccount.setEmail(email);
        tempAccount.setPassword(tempPassword);

        return tempAccount;
    }
}
