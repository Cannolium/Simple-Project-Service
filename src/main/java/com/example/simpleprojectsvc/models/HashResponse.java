package com.example.simpleprojectsvc.models;

import java.util.Map;

import lombok.Data;

@Data
public class HashResponse {

    public Map<String, String> emailHashList;

    public HashResponse(Map<String, String> emailHashList){
        this.emailHashList = emailHashList;
    }
}
