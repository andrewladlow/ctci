package Ex1;

import java.util.HashMap;
import java.util.Map;

public class Ex1_2 {
    public static boolean checkPermutation(String input1, String input2) {
        char[] inputArray1 = input1.toCharArray();
        char[] inputArray2 = input2.toCharArray();
        
        if (input1.length() != input2.length()) {
            return false;
        }
        
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (char c : inputArray1) {
            if (charMap.get(c) != null) {
                int i = charMap.get(c);
                i++;
                charMap.put(c, i);
            } else {
                charMap.put(c, 1);
            }
        }
        
        for (char c : inputArray2) {
            if (charMap.get(c) != null) {
                int i = charMap.get(c);
                i--;
                if (i >= 0) {
                    charMap.put(c, i);
                }
            } else {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(checkPermutation("Hello", "Hello"));
        System.out.println(checkPermutation("Hello", "loHle"));
        System.out.println(checkPermutation("Hello", "World"));
    }
}
