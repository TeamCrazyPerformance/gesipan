package org.tcp.gesipan.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.tcp.gesipan.domain.Account;

@Mapper
@Repository
public interface AccountMapper {
  Account findByEmail(String email);
}
