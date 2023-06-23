package com.tide.ami.repository;

import com.tide.ami.model.User;

/**
 * User repository interface
 */
public interface UserRepository {

  User findByUsername(String username);
  User findByEmailAddress(String emailAddress);
  
  void save(User user);
}
