package com.sample.studentauth.service;

import com.mongodb.*;
import com.sample.studentauth.adapter.rest.model.request.UserRequest;
import com.sample.studentauth.config.MongoDBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.UnknownHostException;
import java.util.List;

@Service
public class StudentAuthService {

    @Autowired
    MongoDBConfig mongoDBConfig;

    public List findUser(UserRequest user) throws UnknownHostException {

        BasicDBObject query = new BasicDBObject();
        query.put("emailId", user.getEmailId());
        query.put("password", user.getPassword());

        return mongoDBConfig.getCollection().find(query).toArray();
    }

    public boolean saveUser(UserRequest user) throws Exception {

        BasicDBObject doc = new BasicDBObject();
        doc.put("name", user.getName());
        doc.put("emailId", user.getEmailId());
        doc.put("address", user.getAddress());
        doc.put("password", user.getPassword());
        doc.put("mobile", user.getMobile());
        try {
            mongoDBConfig.getCollection().insert(doc);
            return true;
        } catch (Exception e) {
            throw new Exception("Failed to insert");
        }
    }
}
