package com.unicorn.utils;

import java.security.SecureRandom;
import java.util.Base64;

public class ApiKeyGenerator {
    public static String generateApiKey() {
        SecureRandom random = new SecureRandom();
        byte[] key = new byte[32]; // 256-bit key
        random.nextBytes(key);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(key);
    }
}
