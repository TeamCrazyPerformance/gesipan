package org.tcp.gesipan.controller;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tcp.gesipan.domain.Account;

@Slf4j
@Controller
public class LoginController {

  @GetMapping("/login")
  public String getLogin() {
    return "login.html";
  }

  @RequestMapping(value="/login", method= RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String getValidation(Account account) {
    log.info(account.getEmail());
    return "login.html";
  }
}
