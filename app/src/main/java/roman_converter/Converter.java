package roman_converter;

import java.util.HashMap;

public class Converter {
    public String getGreeting() {
        return "Hello World!";
    }

    public static int convert(String roman) {
        HashMap<Character, Integer> ConverterMap = new HashMap<>();

        ConverterMap.put('I', 1);
        ConverterMap.put('V', 5);
        ConverterMap.put('X', 10);
        ConverterMap.put('L', 50);
        ConverterMap.put('C', 100);
        ConverterMap.put('D', 500);
        ConverterMap.put('M', 1000);

        int result = 0;
        int prevNum = 0;

        for(int i = roman.length() - 1; i >= 0; i--) {
            Integer currentNum = ConverterMap.get(roman.charAt(i));

            
            if (currentNum >= prevNum) {
                result += currentNum;
            } else {
                result -= currentNum;
            }
            prevNum = currentNum;
        }
      
        return result;
    }
}
