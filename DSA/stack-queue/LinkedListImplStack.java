import java.util.EmptyStackException;

public class LinkedListImplStack<T> {

    public LinkedListImplStack() {
        this.top = null;
    }
    //Node
    private static class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // maintain top
    private Node top;

    //push()
    public void push(T data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    //pop()
    public T pop() {
        if(top == null)
            throw new EmptyStackException();
        T toBePopped = (T) top.data;
        top = top.next;
        return toBePopped;
    }

    //peek()
    public T peek() {
        if(top == null)
            throw new EmptyStackException();
        return (T) top.data;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node it = top;
        while(it!=null) {
            s.append(it.data + " -> ");
            it = it.next;
        }
        return s.toString();
    }

}


