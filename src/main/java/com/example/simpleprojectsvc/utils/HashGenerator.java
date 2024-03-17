package com.example.simpleprojectsvc.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

import static com.example.simpleprojectsvc.utils.Constants.*;

public class HashGenerator {

    public static String generateSHA256Hash(String text) throws Exception {

            // THREAD UNSAFE. Essentially, for us in this project this means that we should create a
            // new one for every request we get (instantiated in a method thats called for 
            // every request). If we used a classwide instance, the batch-updating nature of
            // MessageDigest may begin to overwrite one hash while generating another.
            MessageDigest digest = MessageDigest.getInstance(SHA256);

            // creating what is essentially a List of 'primitive' datatypes (8 bits of information)
            // that represent our original string of text.
            byte[] encodedHash = digest.digest(text.getBytes(StandardCharsets.UTF_8));

            // taking that List of primitive bits of data, and Hex encoding them to a String
            // (translating/mapping this data to a set of letters a-f, and numbers 0-9)
            // then returning it
            return Hex.encodeHexString( encodedHash );

    }

}
