package com.company.encription;

public interface Encryption {
    String encrypt(int key, String message);
    String encrypt(String key, String message);
    String deEncrypt(int key, String message);
    String deEncrypt(String key, String message);
}
