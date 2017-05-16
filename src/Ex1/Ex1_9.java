package Ex1;

public class Ex1_9 {

    public static boolean isSubstring(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        sb.append(s1);    
        String result = sb.toString();

        return result.contains(s2)? true : false;   
    }
    
    public static void main(String[] args) {
        System.out.println(isSubstring(new String("erbottlewat"), new String("waterbottle")));
    } 
}
