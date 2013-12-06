package com.shitouer.sha1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MySHA1 {
    static String getSaltPassword(String password) {
        MessageDigest sha1 = null;
        try {
            sha1 = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            System.exit(0);
        }
        byte[] result = sha1.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        String passwordSalt = sb.toString();
        return passwordSalt;
    }

    public static void main(String[] args) {
        System.out.println(getSaltPassword("123456"));
    }
}
