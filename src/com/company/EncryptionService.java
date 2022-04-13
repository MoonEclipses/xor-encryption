package com.company;

import com.company.encription.Encryption;

public class EncryptionService {
    private Encryption encryption;
    private Integer numKey;
    private String strKey;

    public EncryptionService(Encryption encryption) {
        this.encryption = encryption;
    }

    public EncryptionService(Encryption encryption, Integer numKey, String strKey) {
        this.encryption = encryption;
        this.numKey = numKey;
        this.strKey = strKey;
    }

    public EncryptionService(Encryption encryption, Integer numKey) {
        this.encryption = encryption;
        this.numKey = numKey;
    }

    public EncryptionService(Encryption encryption, String strKey) {
        this.encryption = encryption;
        this.strKey = strKey;
    }

    public String encryptMessageWithNumKey(String message) {
        if (numKey == null) {
            System.out.println("Сначала задайте числовой ключ");
            return "0";
        } else return encryption.encrypt(numKey, message);
    }

    public String deEncryptMessageWithNumKey(String message) {
        if (numKey == null) {
            System.out.println("Сначала задайте числовой ключ");
            return "0";
        }
        else return encryption.deEncrypt(numKey, message);
    }

    public String encryptMessageWithStrKey(String message) {
        if (strKey == null) {
            System.out.println("Сначала задайте строковый ключ");
            return "0";
        } else return encryption.encrypt(strKey, message);

    }

    public String deEncryptMessageWithStrKey(String message) {
        if (strKey == null) {
            System.out.println("Сначала задайте строковый ключ");
            return "0";
        } else return encryption.deEncrypt(strKey, message);
    }

    public int getNumKey() {
        return numKey;
    }

    public void setNumKey(int numKey) {
        this.numKey = numKey;
    }

    public String getStrKey() {
        return strKey;
    }

    public void setStrKey(String strKey) {
        this.strKey = strKey;
    }
}
