package org.tech.tasks;

public class IntegerToRomanConverter {

    public String convert(int number) {
        if(number == 0){
            throw new IllegalArgumentException("Input should not be zero");
        }
        if(number <0){
            throw new IllegalArgumentException("Input should not be negative");
        }

        StringBuilder result = new StringBuilder();
        String[] romans = { "M", "CM", "D", "CD", "C","XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabics = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < arabics.length; i++) {
            while (number >= arabics[i]) {
                result.append(romans[i]);
                number = number - arabics[i];
            }
        }
        return result.toString();
    }

}
