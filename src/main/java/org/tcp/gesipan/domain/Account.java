package org.tcp.gesipan.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("account")
public class Account {
  private String email;
  private String password;
}
