package myLinkedList;

public class MyLinkedList <E> implements LinkedList<E>{
    Node<E> head;
    Node<E> tail;
    int size;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public void insert(E data) {
        Node<E> node = new Node<E>();
        node.data = data;
        node.next = null;
        node.prev = null;

        if(head == null) head = node;
        else
        {
            Node<E> n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
            tail = n.next;

        }size++;


    }

    @Override
    public void insertAt( int index, E data) {
        Node <E> node = new Node<>();
        node.data = data;

        if(index == 0){
            insertAtStart(data);
        } else if (index == size - 1) {
            tail.next = node;
            tail = node;

        } else {
            Node<E> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            //n = node.prev;
            n.next = node;

        } size++;

    }

    @Override
    public void insertAtStart(E data) {
        Node <E> node = new Node<>();
        node.data = data;
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
        size++;

    }

    @Override
    public void deleteAt(int index) {
          if(index == 0) head = head.next;
          else if (index == size - 1) {
              tail = null;
              size--;
              }
        Node<E> n = head;
        Node<E> n1 = null;
        for (int i = 0; i < index-1; i++)
        {
            n = n.next;
        }
        n1 = n.next;
        n.next = n1.next;

        size--;
    }

    @Override
    public void show() {
          Node<E> node = head;
          while(node.next != null){
              System.out.print(node.data + ", ");
              node = node.next;
          }
        System.out.println(node.data);
    }

    @Override
    public void showBack() {
        Node<E> node = tail;
        while(node.prev != null){
            System.out.print(node.data + ", ");
            node = node.prev;
        }
        System.out.println(node.data);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return (E) node.getData();
        }

    }
