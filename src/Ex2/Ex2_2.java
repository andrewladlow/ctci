package Ex2;

public class Ex2_2 {

    public static <E> E returnKth(LinkedList<E> input, int k) {
        return input.get(k);
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<>();
        inputList.insert(5);
        inputList.insert(6);
        inputList.insert(5);
        inputList.insert(2);
        inputList.insert(6);
        System.out.println(inputList.toString());
        
        int k = 3;
        int result = returnKth(inputList, k);
        System.out.println("K: " + k);
        System.out.println("Kth element: " + result);
    }
}
