package com.example.simpleprojectsvc.handler;

import java.util.HashMap;
import java.util.Map;

import com.example.simpleprojectsvc.models.HashRequest;
import com.example.simpleprojectsvc.models.HashResponse;
import static com.example.simpleprojectsvc.utils.HashGenerator.*;

public class SimpleHandler {
    
    public static HashResponse generatResponse(HashRequest hashRequest) throws Exception {
        Map<String, String> emailHashMap  = new HashMap<>();

        for(String email : hashRequest.emailList) {
            emailHashMap.put(email, generateSHA256Hash(email));
        }
        
        return new HashResponse(emailHashMap);
    }

}
