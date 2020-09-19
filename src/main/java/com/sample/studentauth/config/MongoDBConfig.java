package com.sample.studentauth.config;

import com.mongodb.*;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

@Configuration
public class MongoDBConfig {

    public DBCollection getCollection() throws UnknownHostException {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB database = mongoClient.getDB("student");
        return database.getCollection("studentData");
    }
}