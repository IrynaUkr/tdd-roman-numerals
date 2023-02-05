package org.tech.tasks;

public class IntegerToRomanConverter {

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        String[] romans = {"X", "IX", "V", "IV", "I"};
        int[] arabics = {10, 9, 5, 4, 1};

        for (int i = 0; i < arabics.length; i++) {
            while (number >= arabics[i]) {
                result.append(romans[i]);
                number = number - arabics[i];
            }
        }
        return result.toString();
    }

}