package com.sample.studentauth.adapter.rest.controller;

import com.sample.studentauth.adapter.rest.model.request.UserRequest;
import com.sample.studentauth.adapter.rest.model.response.MessageResponse;
import com.sample.studentauth.service.StudentAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentAuthController {

    @Autowired
    StudentAuthService studentAuthService;

    @PostMapping("/student/signup")
    public ResponseEntity signUp(@RequestBody UserRequest user) throws Exception {

        try {
            if (studentAuthService.saveUser(user) == true) ;
            {
                return ResponseEntity.ok(new MessageResponse("Student registered successfully!"));
            }
        } catch (Exception e) {
            throw new Exception("Error in user Sign up");
        }
    }

    @PostMapping("student/login")
    public ResponseEntity logIn(@RequestBody UserRequest user) throws Exception {

        try {
            return ResponseEntity.ok(studentAuthService.findUser(user));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error while fetching data");
        }
    }
}
