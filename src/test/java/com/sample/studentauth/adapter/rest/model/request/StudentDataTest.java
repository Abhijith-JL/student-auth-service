package com.sample.studentauth.adapter.rest.model.request;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class StudentDataTest {

    private static final String id = "test_id";
    private static final String name = "username";
    private static final String emailId = "email@gmail.com";
    private static final String password = "password";
    private static final long mobile = 1234567890;
    private static final String address = "address";

    StudentData studentData = new StudentData();

    @Test
    public void getIdTest() {
        studentData.setId(id);
        String actual = studentData.getId();
        assertEquals(id, actual);
    }

    @Test
    public void setIdTest() {
        studentData.setId(id);
        assertNotNull(studentData.getId());
    }

    @Test
    public void getNameTest() {
        studentData.setName(name);
        String actual = studentData.getName();
        assertEquals(name, actual);
    }

    @Test
    public void setNameTest() {
        studentData.setName(name);
        assertNotNull(studentData.getName());
    }

    @Test
    public void getEmailIdTest() {
        studentData.setEmailId(emailId);
        String actual = studentData.getEmailId();
        assertEquals(emailId, actual);
    }

    @Test
    public void setEmailIdTest() {
        studentData.setEmailId(emailId);
        assertNotNull(studentData.getEmailId());
    }

    @Test
    public void getPasswordTest() {
        studentData.setPassword(password);
        String actual = studentData.getPassword();
        assertEquals(password, actual);
    }

    @Test
    public void setPasswordTest() {
        studentData.setPassword(password);
        assertNotNull(studentData.getPassword());
    }

    @Test
    public void getMobileTest() {
        studentData.setMobile(mobile);
        long actual = studentData.getMobile();
        assertEquals(mobile, actual);
    }

    @Test
    public void setMobileTest() {
        studentData.setMobile(mobile);
        assertNotNull(studentData.getMobile());
    }

    @Test
    public void getAddressTest() {
        studentData.setAddress(address);
        String actual = studentData.getAddress();
        assertEquals(address, actual);
    }

    @Test
    public void setAddressTest() {
        studentData.setAddress(address);
        assertNotNull(studentData.getAddress());
    }

    @Test
    public void constructorTest() {
        StudentData user = new StudentData(name, emailId, password, mobile, address);
        assertNotNull(user);
        assertEquals(name, user.getName());
        assertEquals(password, user.getPassword());
        assertEquals(emailId, user.getEmailId());
        assertEquals(mobile, user.getMobile());
        assertEquals(address, user.getAddress());
    }
}
