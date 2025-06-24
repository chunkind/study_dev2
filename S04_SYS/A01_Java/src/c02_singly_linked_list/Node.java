package c02_singly_linked_list;

public class Node<T> {
    public T data;
    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }
}
