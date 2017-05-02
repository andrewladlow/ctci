package Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_3 {
    public static String URLify (String input, int length) {
        
        char[] result = input.toCharArray();
        
        System.out.println(length);
        System.out.println(result.length);
        
        for (int i = 0; i < length; i++) {
            if (result[i] == ' ') {
                for (int j = result.length - 3; j > i; j--) { // -3 rather than -1 as we're adding 2 additional characters
                    result[j+2] = result[j];
                }
                result[i] = '%';
                result[i+1] = '2';
                result[i+2] = '0';
            }
        }
        
        return new String(result);
    }
    
    public static void main(String[] args) {
        System.out.println(URLify("Hello World  ", 11));
        System.out.println(URLify("Mr John Smith    ", 13));
    }
    
}
