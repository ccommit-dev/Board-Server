package com.fastcampus.boardserver.utils;

import lombok.extern.log4j.Log4j2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@Log4j2
public class SHA256Util {
    public static final String ENCRYPTION_TYPE = "SHA-256";
    public static String encryptSHA256(String str) {
        String SHA = null;

        MessageDigest sh;
        try {
            sh = MessageDigest.getInstance(ENCRYPTION_TYPE);
            sh.update(str.getBytes());
            byte[] byteData = sh.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            SHA = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("암호화 에러!", e);
        }
        return SHA;
    }
}
