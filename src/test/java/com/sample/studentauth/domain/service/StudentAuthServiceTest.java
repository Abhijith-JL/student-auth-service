//package com.sample.studentauth.domain.service;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.WriteResult;
//import com.sample.studentauth.adapter.rest.model.request.UserRequest;
//import com.sample.studentauth.config.MongoDBConfig;
//import com.sample.studentauth.service.StudentAuthService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.net.UnknownHostException;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class StudentAuthServiceTest {
//
//    private static final String username = "username";
//    private static final String password = "password";
//
//    UserRequest userRequest = new UserRequest();
//
//    @Mock
//    MongoDBConfig mongoDBConfig;
//
//    @Mock
//    MongoTemplate mongoTemplate;
//
//    @InjectMocks
//    StudentAuthService studentAuthService;
//
//    @Test
//    public void findUser() throws UnknownHostException {
//        this.setValues();
//        BasicDBObject query = new BasicDBObject();
//        query.put("emailId", userRequest.getEmailId());
//        query.put("password", userRequest.getPassword());
//        List user = new ArrayList<>();
//        user.add(userRequest);
//        Mockito.when(mongoDBConfig.getCollection().find(query).toArray()).thenReturn(user);
//        List actual = studentAuthService.findUser(userRequest);
//        assertEquals(user, actual);
//
//
//    }
//
//        @Test
//    public void saveUserTest() throws Exception {
//        this.setValues();
//        BasicDBObject doc = new BasicDBObject();
//        doc.put("name","dummy");
//        WriteResult result = Mockito.mock(WriteResult.class);
////        result = mongoTemplate.updateMulti(finder, update, UserRequest.class);
//            Mockito.when(mongoDBConfig.getCollection().insert(doc)).thenReturn(result);
//        Boolean actual = studentAuthService.saveUser(userRequest);
//        assertTrue(actual);
//    }
//
//
//    private void setValues() {
//        userRequest.setName(username);
//        userRequest.setPassword(password);
//    }
//
//}
