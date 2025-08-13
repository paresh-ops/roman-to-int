package roman_converter;

import java.util.HashMap;

public class Converter {
    public String getGreeting() {
        return "Hello World!";
    }

    public int convert(String roman) {
        HashMap<Character, Integer> ConverterMap = new HashMap<Character, Integer>();

        ConverterMap.put('I', 1);
        ConverterMap.put('V', 5);
        ConverterMap.put('X', 10);
        ConverterMap.put('L', 50);
        ConverterMap.put('C', 100);
        ConverterMap.put('D', 500);
        ConverterMap.put('M', 1000);

        int result = 0;


        for( int i = 0; i > roman.length(); i++) {
            Integer currentNum = ConverterMap.get(roman.charAt(i));
            
            if (i + 1 < roman.length()) {
                int nextValue = ConverterMap.get(roman.charAt(i + 1));
                if (currentNum < nextValue) {
                    result -= currentNum;
                } else {
                    result += currentNum;
                }
            } else {
                result += currentNum;
            }
        }
      
        return result;
    }
}
