package myLinkedList;

public class Node<E> {
    E data;
    Node next;
    Node prev;

//    public Node(E data, Node next, Node previous) {
//        this.data = data;
//        this.next = next;
//        this.prev = previous;
//    }

       public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }
    public Node<E> getPrev(){
        return prev;
    }

    public Node() {


    }
}
