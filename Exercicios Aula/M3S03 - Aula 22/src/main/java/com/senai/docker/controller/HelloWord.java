package com.senai.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker-compose/helloWord")
public class HelloWord {

    @GetMapping
    public ResponseEntity<String> findAll() {
        String helloWord = "helloWord";
        return ResponseEntity.ok().body(helloWord);
    }

}