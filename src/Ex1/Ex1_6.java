package Ex1;

public class Ex1_6 {
    public static String stringCompression(String input) {
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 == input.length() || input.charAt(i + 1) != input.charAt(i)) {
                sb.append(input.charAt(i));
                sb.append(count);
                count = 1;
            } else {
                count++;
            }
        }
        
        return sb.length() >= input.length()? input : sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
    }
}