package com.sample.studentauth.adapter.rest.controller;

import com.sample.studentauth.adapter.rest.model.request.StudentData;
import com.sample.studentauth.service.StudentAuthService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class StudentAuthControllerTest {

    private static final String id = "test_id";
    private static final String name = "username";
    private static final String emailId = "email@gmail.com";
    private static final String password = "password";
    private static final long mobile = 1234567890;
    private static final String address = "address";

    StudentData studentData = new StudentData(name, emailId, password, mobile, address);

    @Mock
    StudentAuthService studentAuthService;

    @InjectMocks
    StudentAuthController studentAuthController;

    @Test
    public void signupTest() throws Exception {
        StudentData data = new StudentData(name, emailId, password, mobile, address);
        data.setId(id);
        Mockito.when(studentAuthService.saveUser(studentData)).thenReturn(data);
        ResponseEntity actual = studentAuthController.signUp(studentData);
        assertEquals(200, actual.getStatusCodeValue());
        assertEquals(HttpStatus.OK, actual.getStatusCode());

    }

    @Test
    public void logInTest() throws Exception {
        studentData.setId(id);
        StudentData loginData = new StudentData();
        loginData.setEmailId(emailId);
        loginData.setPassword(password);
        List user = new ArrayList<>();
        user.add(studentData);
        Mockito.when(studentAuthService.findUser(loginData)).thenReturn(user);
        ResponseEntity actual = studentAuthController.logIn(loginData);
        assertEquals(200, actual.getStatusCodeValue());
        assertEquals(HttpStatus.OK, actual.getStatusCode());

    }
}
