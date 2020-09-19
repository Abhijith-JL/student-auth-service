package com.sample.studentauth.adapter.rest.model.request;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UserRequestTest {

    private static final String name = "username";
    private static final String emailId = "email@gmail.com";
    private static final String password = "password";
    private static final long mobile = 1234567890;
    private static final String address = "address";

    UserRequest userRequest = new UserRequest();

    @Test
    public void getNameTest() {
        userRequest.setName(name);
        String actual = userRequest.getName();
        assertEquals(name, actual);
    }

    @Test
    public void setNameTest() {
        userRequest.setName(name);
        assertNotNull(userRequest.getName());
    }

    @Test
    public void getEmailIdTest() {
        userRequest.setEmailId(emailId);
        String actual = userRequest.getEmailId();
        assertEquals(emailId, actual);
    }

    @Test
    public void setEmailIdTest() {
        userRequest.setEmailId(emailId);
        assertNotNull(userRequest.getEmailId());
    }

    @Test
    public void getPasswordTest() {
        userRequest.setPassword(password);
        String actual = userRequest.getPassword();
        assertEquals(password, actual);
    }

    @Test
    public void setPasswordTest() {
        userRequest.setPassword(password);
        assertNotNull(userRequest.getPassword());
    }

    @Test
    public void getMobileTest() {
        userRequest.setMobile(mobile);
        long actual = userRequest.getMobile();
        assertEquals(mobile, actual);
    }

    @Test
    public void setMobileTest() {
        userRequest.setMobile(mobile);
        assertNotNull(userRequest.getMobile());
    }

    @Test
    public void getAddressTest() {
        userRequest.setAddress(address);
        String actual = userRequest.getAddress();
        assertEquals(address, actual);
    }

    @Test
    public void setAddressTest() {
        userRequest.setAddress(address);
        assertNotNull(userRequest.getAddress());
    }

    @Test
    public void constructorTest() {
        UserRequest user = new UserRequest(name,emailId,password,mobile,address);
        assertNotNull(user);
        assertEquals(name,user.getName());
        assertEquals(password,user.getPassword());
        assertEquals(emailId,user.getEmailId());
        assertEquals(mobile,user.getMobile());
        assertEquals(address,user.getAddress());
    }
}
