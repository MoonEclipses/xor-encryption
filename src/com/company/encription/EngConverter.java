package com.company.encription;

public class EngConverter implements Converter {
    @Override
    public Integer[] lettersToNumbers(String message) {
        Integer[] numbers = new Integer[message.length()];
        int index = 0;
        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));
            if (ch == ' ')
                numbers[index++] = null;
            else
                numbers[index++] = (int) ch - 'a';
        }
        return numbers;
    }
    @Override
    public String numbersToLetters(Integer[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : numbers) {
            if (number == null)
                stringBuilder.append(" ");
            else {
                int numASII = number + (int) 'a';
                stringBuilder.append(Character.toLowerCase((char) (numASII)));
            }
        }
        String message = stringBuilder.toString();
        return message;
    }
}
