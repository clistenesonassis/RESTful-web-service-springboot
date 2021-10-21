package com.appsdeveloperblog.app.ws.utils;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class GenerateUUID {

    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "38164710298dhjfkDM46373!@#$|%*7K3I23OQ189y24bjvrjh12g3u14ZSC9y2hj498u";

    public String generateUserId(int length) {
        return generateRandomString(length);
    }

    private String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(returnValue);
    }
}
