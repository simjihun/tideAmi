package com.tide.ami.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tide.ami.exception.EmailAddressExistsException;
import com.tide.ami.exception.RegistrationException;
import com.tide.ami.exception.UsernameExistsException;
import com.tide.ami.payload.RegistrationPayload;
import com.tide.ami.result.ApiResult;
import com.tide.ami.result.Result;
import com.tide.ami.service.UserService;

@Controller
public class RegistrationApiController {

  private UserService service;

  public RegistrationApiController(UserService service) {
    this.service = service;
  }

  @PostMapping("/api/registrations")
  public ResponseEntity<ApiResult> register(@Valid @RequestBody RegistrationPayload payload) {
	  //@valid : 데이터 전달 전 reg~payload 데이터 검증, 유효한지 확인
    try {
      service.register(payload.toCommand());
      return Result.created();
    } catch (RegistrationException e) {
      String errorMessage = "Registration failed";
      if (e instanceof UsernameExistsException) {
        errorMessage = "Username already exists";
      } else if (e instanceof EmailAddressExistsException) {
        errorMessage = "Email address already exists";
      }
      return Result.failure(errorMessage);
    }
  }
}
