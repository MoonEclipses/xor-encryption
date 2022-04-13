package com.company.encription;

public interface Converter {
    Integer[] lettersToNumbers(String message);
    String numbersToLetters(Integer[] numbers);
}
