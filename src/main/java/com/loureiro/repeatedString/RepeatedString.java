package com.loureiro.repeatedString;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {

    public Map<String, Integer> characterCounter(String text) {
        String treatedString = text.replace(" ", "").toLowerCase();
        Map<String, Integer> mapper = new HashMap<>();
        for (char caracter : treatedString.toCharArray()) {
            Integer count = mapper.get(String.valueOf(caracter));
            if (count != null) {
                mapper.put(String.valueOf(caracter), ++count);
            } else {
                mapper.put(String.valueOf(caracter), 1);
            }
        }
        return mapper;
    }

    public void printString(Map<String, Integer> text) {
        for (Map.Entry<String, Integer> letters : text.entrySet()) {
            System.out.println(letters.getKey() + ": " + letters.getValue());
        }
    }
}
