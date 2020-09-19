package com.sample.studentauth.adapter.rest.controller;

import com.sample.studentauth.adapter.rest.model.request.UserRequest;
import com.sample.studentauth.service.StudentAuthService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentAuthControllerTest {

    private static final String name = "username";
    private static final String emailId = "email@gmail.com";
    private static final String password = "password";
    private static final long mobile = 1234567890;
    private static final String address = "address";

    UserRequest userRequest = new UserRequest(name,emailId,password,mobile,address);

    @Mock
    StudentAuthService studentAuthService;

    @Autowired
    StudentAuthController studentAuthController;

    @Test
    public void signupTest() throws Exception {
        Mockito.when(studentAuthService.saveUser(userRequest)).thenReturn(true);
        ResponseEntity actual = studentAuthController.signUp(userRequest);
        assertEquals(200, actual.getStatusCodeValue());
        assertEquals(HttpStatus.OK,actual.getStatusCode());
    }

    @Test
    public void logInTest() throws Exception {
        List user = new ArrayList<>();
         user.add(userRequest);
        Mockito.when(studentAuthService.findUser(userRequest)).thenReturn(user);
        ResponseEntity actual = studentAuthController.signUp(userRequest);
        assertEquals(200, actual.getStatusCodeValue());
        assertEquals(HttpStatus.OK,actual.getStatusCode());

    }

}
