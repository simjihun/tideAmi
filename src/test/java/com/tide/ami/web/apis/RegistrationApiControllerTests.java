package com.tide.ami.web.apis;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.tide.ami.controller.RegistrationApiController;
import com.tide.ami.exception.EmailAddressExistsException;
import com.tide.ami.exception.UsernameExistsException;
import com.tide.ami.payload.RegistrationPayload;
import com.tide.ami.service.UserService;
import com.tide.ami.utils.JsonUtils;

//@RunWith(SpringRunner.class)
//@WebMvcTest(RegistrationApiController.class)
public class RegistrationApiControllerTests {
//
//  @Autowired
//  private MockMvc mvc;
//
//  @MockBean
//  private UserService serviceMock;
//
//  @Test
//  public void register_blankPayload_shouldFailAndReturn400() throws Exception {
//    mvc.perform(post("/api/registrations"))
//      .andExpect(status().is(400));
//  }
//
//  @Test
//  public void register_existedUsername_shouldFailAndReturn400() throws Exception {
//    RegistrationPayload payload = new RegistrationPayload();
//    payload.setUsername("exist");
//    payload.setEmailAddress("test@taskagile.com");
//    payload.setPassword("MyPassword!");
//
//    doThrow(UsernameExistsException.class)
//      .when(serviceMock)
//      .register(payload.toCommand());
//
//    mvc.perform(
//      post("/api/registrations")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(JsonUtils.toJson(payload)))
//      .andExpect(status().is(400))
//      .andExpect(jsonPath("$.message").value("Username already exists"));
//  }
//
//  @Test
//  public void register_existedEmailAddress_shouldFailAndReturn400() throws Exception {
//    RegistrationPayload payload = new RegistrationPayload();
//    payload.setUsername("test");
//    payload.setEmailAddress("exist@taskagile.com");
//    payload.setPassword("MyPassword!");
//
//    doThrow(EmailAddressExistsException.class)
//      .when(serviceMock)
//      .register(payload.toCommand());
//
//    mvc.perform(
//      post("/api/registrations")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(JsonUtils.toJson(payload)))
//      .andExpect(status().is(400))
//      .andExpect(jsonPath("$.message").value("Email address already exists"));
//  }
//
//  @Test
//  public void register_validPayload_shouldSucceedAndReturn201() throws Exception {
//    RegistrationPayload payload = new RegistrationPayload();
//    payload.setUsername("sunny");
//    payload.setEmailAddress("sunny@taskagile.com");
//    payload.setPassword("MyPassword!");
//
//    doNothing().when(serviceMock)
//      .register(payload.toCommand());
//
//    mvc.perform(
//      post("/api/registrations")
//        .contentType(MediaType.APPLICATION_JSON)
//        .content(JsonUtils.toJson(payload)))
//      .andExpect(status().is(201));
//  }
}
