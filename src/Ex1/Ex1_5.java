package Ex1;

public class Ex1_5 {
    
    public static boolean oneAway(String input1, String input2) {
        boolean result = true;
        
        if (input1.length() - 1 == input2.length()) { // insert
            result = editStringChar(input2, input1);
        } else if (input1.length() + 1 == input2.length()) { // remove
            result = editStringChar(input1, input2);       
        } else if (input1.length() == input2.length()) { // replace
            result = replaceStringChar(input1, input2);
        }
        
        return result;
    }
    
    private static Boolean editStringChar(String input1, String input2) {
        int i1 = 0;
        int i2 = 0;
        int matchCount = 0;
        while (i1 < input1.length() && i2 < input2.length()) {
            if (input1.charAt(i1) != input2.charAt(i2)) {
                matchCount++;
                if (matchCount > 1) {
                    return false;
                } else {
                    i2++;
                }
            } else {
                i1++;
                i2++;
            }
        }
        
        return true;
    }
    
    private static Boolean replaceStringChar(String input1, String input2) {
        int i1 = 0;
        int i2 = 0;
        int matchCount = 0;
        while (i1 < input1.length() && i2 < input2.length()) {
            if (input1.charAt(i1) != input2.charAt(i2)) {
                matchCount++;
                if (matchCount > 1) {
                    return false;
                }
            }
            i1++;
            i2++;
            
        }
        
        return true;
    }
    
    public static void main(String[] args) { 
        System.out.println(oneAway("pale", "ple"));
        System.out.println(oneAway("pales", "pale"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("pale", "bake"));

    }
    
}
