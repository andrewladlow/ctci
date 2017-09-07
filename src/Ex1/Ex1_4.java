package Ex1;

import java.util.HashMap;
import java.util.Map;

public class Ex1_4 {

    public static boolean palindromePermutation(String input) {
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        
        // example given in ctci doesn't consider whitespace, therefore we remove from input 
        char[] inputArray = input.toLowerCase().replaceAll("\\s", "").toCharArray();
        
        for (char c : inputArray) {
            if (charMap.get(c) != null) {
                int i = charMap.get(c);
                i++;
                charMap.put(c, i);
            } else {
                charMap.put(c, 1);
            }
        }
        
        int oddCount = 0;
        for (char c : inputArray) {
            int i = charMap.get(c);
            //System.out.println("c: " + c + " i: " + i);
            if (i % 2 == 1) {
                oddCount++;
            }
        }
        
        System.out.println(oddCount);
        
        if (oddCount > 1) {
            return false;
        } else {
            return true;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(palindromePermutation("Tact Coa"));
    }
}
