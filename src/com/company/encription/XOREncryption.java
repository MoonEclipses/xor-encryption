package com.company.encription;

public class XOREncryption implements Encryption {
    private Converter converter;

    public XOREncryption() {
        this.converter = new RusConverter();
    }

    @Override
    public String encrypt(int key, String message) {
        Integer[] numbers = converter.lettersToNumbers(message);
        Integer[] newNumbers = new Integer[numbers.length];
        int index = 0;
        for (Integer number : numbers) {
            if (number == null)
                newNumbers[index++] = null;
            else {
                int res = number ^ key;
                newNumbers[index++] = res;
            }
        }
        String result = converter.numbersToLetters(newNumbers);
        return result;
    }

    @Override
    public String encrypt(String key, String message) {
        Integer[] numbersMessage = converter.lettersToNumbers(message);
        Integer[] numbersKey = converter.lettersToNumbers(key);
        Integer[] newNumbers = new Integer[numbersMessage.length];
        int index = 0;
        int keyIndex = 0;
        for (Integer number : numbersMessage) {
            if (number == null)
                newNumbers[index++] = null;
            else {
                int res = number ^ numbersKey[keyIndex++];
                newNumbers[index++] = res;
            }
            keyIndex = keyIndex>=numbersKey.length?0:keyIndex;
        }
        String result = converter.numbersToLetters(newNumbers);
        return result;
    }

    @Override
    public String deEncrypt(int key, String message) {
        Integer[] numbers = converter.lettersToNumbers(message);
        Integer[] newNumbers = new Integer[numbers.length];
        int index = 0;
        for (Integer number : numbers) {
            if (number == null)
                newNumbers[index++] = null;
            else {
                int res = number ^ key;
                newNumbers[index++] = res;
            }
        }
        String result = converter.numbersToLetters(newNumbers);
        return result;
    }

    @Override
    public String deEncrypt(String key, String message) {
        Integer[] numbersMessage = converter.lettersToNumbers(message);
        Integer[] numbersKey = converter.lettersToNumbers(key);
        Integer[] newNumbers = new Integer[numbersMessage.length];
        int index = 0;
        int keyIndex = 0;
        for (Integer number : numbersMessage) {
            if (number == null)
                newNumbers[index++] = null;
            else {
                int res = number ^ numbersKey[keyIndex++];
                newNumbers[index++] = res;
            }
            keyIndex = keyIndex>=numbersKey.length?0:keyIndex;
        }
        String result = converter.numbersToLetters(newNumbers);
        return result;
    }
}
