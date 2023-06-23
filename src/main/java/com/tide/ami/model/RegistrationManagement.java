package com.tide.ami.model;

import org.springframework.stereotype.Component;

import com.tide.ami.exception.EmailAddressExistsException;
import com.tide.ami.exception.RegistrationException;
import com.tide.ami.exception.UsernameExistsException;
import com.tide.ami.repository.UserRepository;
import com.tide.ami.security.PasswordEncryptor;

/**
 * User registration domain service
 */
@Component
public class RegistrationManagement {

  private UserRepository repository;
  private PasswordEncryptor passwordEncryptor;

  public RegistrationManagement(UserRepository repository, PasswordEncryptor passwordEncryptor) {
    this.repository = repository;
    this.passwordEncryptor = passwordEncryptor;
  }

  public User register(String username, String emailAddress, String password)
    throws RegistrationException {
    User existingUser = repository.findByUsername(username);
    if (existingUser != null) {
      throw new UsernameExistsException();
    }

    existingUser = repository.findByEmailAddress(emailAddress.toLowerCase());
    if (existingUser != null) {
      throw new EmailAddressExistsException();
    }

    String encryptedPassword = passwordEncryptor.encrypt(password);
    User newUser = User.create(username, emailAddress.toLowerCase(), encryptedPassword);
    repository.save(newUser);
    return newUser;
  }
}
