package com.app.UserInfo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @GetMapping("/")
    public ResponseEntity getUser() {
        try {
            return ResponseEntity.ok("User Info");
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
