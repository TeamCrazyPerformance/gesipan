package org.tcp.gesipan.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tcp.gesipan.domain.Account;

@Mapper
public interface AccountMapper {
    Account getAccount(String email);
}
