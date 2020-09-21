package com.sample.studentauth.service;

import com.sample.studentauth.adapter.rest.model.request.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAuthService {

    @Autowired
    MongoTemplate mongoTemplate;

    public List findUser(StudentData user) throws Exception {

        Query query = new Query();
        query.addCriteria(Criteria.where("emailId").is(user.getEmailId()))
                .addCriteria(Criteria.where("password").is(user.getPassword()));
        try {
            return mongoTemplate.find(query, StudentData.class);
        } catch (Exception e) {
            throw new Exception("Cannot find the user");
        }
    }

    public StudentData saveUser(StudentData user) throws Exception {

        try {
            return mongoTemplate.save(user);
        } catch (Exception e) {
            throw new Exception("Insertion failed");
        }
    }
}
