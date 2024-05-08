package com.gcp.cloudrunex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gcpdemo")
public class CloudRunController {
    Logger logger= LoggerFactory.getLogger(CloudRunController.class);
    @GetMapping("/hello")
    public ResponseEntity<String> getUserById(){
        String str="Hello!!! Welcome to Cloud Run Spring boot";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }
}
