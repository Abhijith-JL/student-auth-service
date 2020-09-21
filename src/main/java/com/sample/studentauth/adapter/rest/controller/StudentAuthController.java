package com.sample.studentauth.adapter.rest.controller;

import com.sample.studentauth.adapter.rest.model.request.StudentData;
import com.sample.studentauth.adapter.rest.model.response.Response;
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
    public ResponseEntity signUp(@RequestBody StudentData user) throws Exception {

        try {
            return ResponseEntity.ok(new Response(studentAuthService.saveUser(user)));
        } catch (Exception e) {
            throw new Exception("Error in user Sign up");
        }
    }

    @PostMapping("student/login")
    public ResponseEntity logIn(@RequestBody StudentData user) throws Exception {

        try {
            return ResponseEntity.ok(studentAuthService.findUser(user));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error while fetching data");
        }
    }
}
