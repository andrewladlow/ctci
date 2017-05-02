package Ex1;

import java.util.HashMap;
import java.util.Map;

public class Ex1_1 {
    
    public static boolean isUnique(String input) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] inputArray = input.toCharArray();
        
        for (char c : inputArray) {
            if (charMap.get(c) != null) {
                return false;
            } else {
                charMap.put(c, 1);
            }
        }
        return true;
    }
    
    // no additional data structures
    public static boolean isUnique2(String input) {
        char[] inputArray = input.toCharArray();
        
        for (int i = 0; i < inputArray.length; i++) {
            char c1 = inputArray[i];
            for (int j = 0; j < inputArray.length; j++) {
                char c2 = inputArray[j];
                // same chars but not in same positions within string
                if (c1 == c2 && i != j) {
                    return false;
                }
            }
        }   
        return true;
    }    
    
    public static void main(String[] args) {
        System.out.println(isUnique("Hello"));
        System.out.println(isUnique("World"));
        
        System.out.println(isUnique2("Hello"));
        System.out.println(isUnique2("World"));
    }
}
