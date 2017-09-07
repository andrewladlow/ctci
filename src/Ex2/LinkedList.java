package Ex2;

import java.util.Iterator;

// singly linked list
public class LinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private int length;
    
    public LinkedList() {
        length = 0;
    }
    
    // add to end of list
    public void insert(E data) {
        insert(length, data);
    }
    
    // add data at given position
    public Boolean insert(int pos, E data) {
        if (pos > length) {
            System.out.println("Insert position out of bounds");
            return false;
        } else if (head == null) {
            head = new Node<E>(data);
            length++;
            return true;
        } else if (pos == 0) {
            Node<E> newNode = new Node<E>(data);
            newNode.next = head;
            head = newNode;
            length++;
            return true;
        } else {
            Node<E> n = head;
            while (n != null) {
                for (int i = 0; i <= pos; i++) {
                    // require knowledge of nodes immediately before and after insertion point
                    if (i + 1 == pos) {
                        Node<E> newNode = new Node<E>(data);
                        newNode.next = n.next;
                        n.next = newNode;
                        length++;
                        return true;
                    } else {
                        n = n.next;
                    }
                }
            }
        }
        return false;
    }
    
    // remove first occurrence of data
    public Boolean removeFirst(E data) {
        if (head.data == data) {
            head = head.next;
            length--;
            return true;
        } else {
            Node<E> n = head;
            while (n.next != null) {
                if (n.next.data == data) {
                    n.next = n.next.next;
                    length--;
                    return true;
                }
                n = n.next;
            }
        }
        return false;
    }
    
    // remove data at given position
    public Boolean remove(int pos) {
        if (pos > this.length) {
            return false;
        } else if (pos == 0) {
            head = head.next;
            length--;
        } else {
            Node<E> n = head;
            while (n.next.next != null) {
                for (int i = 0; i <= pos; i++) {
                    if (i + 1 == pos) {
                        n.next = n.next.next;
                        length--;
                        return true;
                    } else {
                        n = n.next;
                    }
                }
            }
        }
        return false;
    }
    
    // retrieve data at given position
    public E get(int pos) {
        Node<E> n = head;
        for (int i = 0; i <= pos; i++) {
            if (i == pos) {
               break;           
            }
            n = n.next;
        }
        return n.data;
    }
    
    // check if given value exists in list
    public Boolean contains(Object data) {
        Node<E> n = head;
        while (n != null) {
            if (n.data.equals(data)) {
                return true;
            } else {
                n = n.next;
            }
        }
        
        return false;
    }
    
    // return list contents
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> n = head;
        
        while (n != null) {
            sb.append(n.data + ", ");    
            n = n.next;
        }
        
        // remove last comma
        sb.delete(sb.length() - 2, sb.length());
        
        return sb.toString();
    }
    
    public int getLength() {
        return this.length;
    }
    
    private class LinkedListIterator implements Iterator<E> {
        
        private int index = 0;
        
        public boolean hasNext() {
            return index < LinkedList.this.length;
        }
        
        public E next() {
            return LinkedList.this.get(index++);
        }
        
        public void remove() {
            LinkedList.this.remove(index--);
        }
        
    }
    
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

}
