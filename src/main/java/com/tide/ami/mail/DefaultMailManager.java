package com.tide.ami.mail;

import org.springframework.stereotype.Component;

@Component
public class DefaultMailManager implements MailManager {

  @Override
  public void send(String emailAddress, String subject, String template, MessageVariable... variables) {

  }
}
