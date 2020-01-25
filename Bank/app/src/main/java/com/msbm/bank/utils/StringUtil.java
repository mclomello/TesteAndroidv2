package com.msbm.bank.utils;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {

    private static Map<String, String> upperCase;

    static {
        upperCase = new HashMap<>();
        upperCase.put("Q", "Q");
        upperCase.put("W", "W");
        upperCase.put("E", "E");
        upperCase.put("R", "R");
        upperCase.put("T", "T");
        upperCase.put("Y", "Y");
        upperCase.put("U", "U");
        upperCase.put("I", "I");
        upperCase.put("O", "O");
        upperCase.put("P", "P");
        upperCase.put("A", "A");
        upperCase.put("S", "S");
        upperCase.put("D", "D");
        upperCase.put("F", "F");
        upperCase.put("G", "G");
        upperCase.put("H", "H");
        upperCase.put("J", "J");
        upperCase.put("K", "K");
        upperCase.put("L", "L");
        upperCase.put("Ç", "Ç");
        upperCase.put("Z", "Z");
        upperCase.put("X", "X");
        upperCase.put("C", "C");
        upperCase.put("V", "V");
        upperCase.put("B", "B");
        upperCase.put("N", "N");
        upperCase.put("M", "M");
    }

    public static boolean hasUpperCharacter(String text) {
        char[] charArray = text.toCharArray();

        for (char character : charArray) {
            if(upperCase.containsValue(String.valueOf(character))) {
                return true;
            }
        }

        return false;
    }
}