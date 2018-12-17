package com.azl;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class md5 {
    public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        //需要加密的字符串
        String credentials = "admin";
        int hashIterations = 2;
        ByteSource credentialsSalt = ByteSource.Util.bytes("admin");
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}
