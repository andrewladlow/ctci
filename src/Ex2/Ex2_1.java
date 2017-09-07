package Ex2;

import java.util.HashMap;
import java.util.Map;

public class Ex2_1 {
    
    public static <E> void removeDups(LinkedList<E> input) {
        Map<E, Integer> count = new HashMap<E, Integer>();

        // forwards removal
/*        for (int i = 0; i < input.getLength(); i++) {
            if (count.containsKey(input.get(i))) {
                input.remove(i);
            } else {
                count.put(input.get(i), 1);
            }
        }*/
        
        // without hashmap
        for (int i = 0; i < input.getLength(); i++) {
            for (int j = i + 1; j < input.getLength(); j++) {
                if (input.get(i).equals(input.get(j))) {
                    input.remove(j);
                }
            }
        }

    }
    
    public static void main(String[] args) {       
        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.insert(5);
        inputList.insert(6);
        inputList.insert(5);
        inputList.insert(2);
        inputList.insert(6);   
        
        System.out.println(inputList.toString());
        removeDups(inputList);
        System.out.println(inputList.toString());
    }

}
