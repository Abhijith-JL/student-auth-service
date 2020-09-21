package com.sample.studentauth.service;

import com.sample.studentauth.adapter.rest.model.request.StudentData;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;


@SpringBootTest
public class StudentAuthServiceTest {

    private static final String id = "test_id";
    private static final String name = "username";
    private static final String emailId = "email@gmail.com";
    private static final String password = "password";
    private static final long mobile = 1234567890;
    private static final String address = "address";

    StudentData studentData = new StudentData(name, emailId, password, mobile, address);

    @Mock
    MongoTemplate mongoTemplate;

    @Mock
    Query query;

    @InjectMocks
    StudentAuthService studentAuthService;

    @Test
    public void findUser() throws Exception {
        studentData.setId(id);
        List result = new ArrayList();
        result.add(studentData);
        StudentData data = new StudentData();
        data.setEmailId(emailId);
        data.setPassword(password);
        Mockito.when(mongoTemplate.find(query, StudentData.class)).thenReturn(result);
        List student = studentAuthService.findUser(data);
        assertNotNull(student);

    }

    @Test
    public void saveUserTest() throws Exception {
        StudentData data = new StudentData(name, emailId, password, mobile, address);
        data.setId(id);
        Mockito.when(mongoTemplate.save(studentData)).thenReturn(data);
        StudentData student = studentAuthService.saveUser(studentData);
        assertThat(data.getId()).isEqualTo(student.getId());
        assertThat(data.getAddress()).isEqualTo(student.getAddress());
        assertThat(data.getEmailId()).isEqualTo(student.getEmailId());
        assertThat(data.getMobile()).isEqualTo(student.getMobile());
        assertThat(data.getName()).isEqualTo(student.getName());
        assertThat(data.getPassword()).isEqualTo(student.getPassword());
    }

}
