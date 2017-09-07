package Ex2;

public class Node<E> {
    public Node<E> next = null;
    public E data;
    
    public Node (E data) {
        this.data = data;
    }
}
