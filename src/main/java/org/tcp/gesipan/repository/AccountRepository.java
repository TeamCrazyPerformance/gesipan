package org.tcp.gesipan.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.tcp.gesipan.domain.Account;
import org.tcp.gesipan.mapper.AccountMapper;

@Repository
public class AccountRepository implements AccountMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getValidation(String email) {
        return "A";
    }
}
