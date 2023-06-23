package com.tide.ami.security;

import org.springframework.stereotype.Component;

@Component
public class PasswordEncryptorDelegator implements PasswordEncryptor {

  @Override
  public String encrypt(String rawPassword) {

    return rawPassword;
  }
}
