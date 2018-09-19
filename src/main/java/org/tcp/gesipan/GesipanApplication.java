package org.tcp.gesipan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tcp.gesipan.mapper.AccountMapper;

@SpringBootApplication
@MapperScan("org.tcp.gesipan")
public class GesipanApplication {
  @Autowired
  AccountMapper accountMapper;

  public static void main(String[] args) {
    SpringApplication.run(GesipanApplication.class, args);
  }
}
