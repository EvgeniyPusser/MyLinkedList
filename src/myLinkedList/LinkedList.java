package myLinkedList;

public interface LinkedList <E>{
    void insert(E data);
    void insertAt(int index, E data);
    void insertAtStart(E data);
    void deleteAt(int index);
    void show();
    void showBack();
    int size();
    E getElementByIndex(int index);

}
