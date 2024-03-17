package com.example.simpleprojectsvc.controller;

import com.example.simpleprojectsvc.models.HashRequest;
import com.example.simpleprojectsvc.models.HashResponse;
import com.example.simpleprojectsvc.handler.SimpleHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("simpleservice/api")
public class SimpleController {
    
    @PostMapping("/hash")
    public HashResponse postMethodName(@RequestBody HashRequest request) {
        
        try{
            return SimpleHandler.generatResponse(request);
        } 
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error generating hashes", e);
        }

    }
    








}
