package pl.patryktubicz;

import java.util.Map;
import java.util.HashMap;

public class Main {
    private static final Map<Character, Integer> values = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int result = 0;
        int len = s.length();

        for(int i = 0; i < len; i++) {
            if(i != len - 1 && values.get(s.charAt(i)) < values.get(s.charAt(i + 1))) {
                result += values.get(s.charAt(i + 1)) - values.get(s.charAt(i));
                i++;
            }
            else {
                result += values.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main ob = new Main();
        System.out.println(ob.romanToInt("MCMXCIV"));
    }
}