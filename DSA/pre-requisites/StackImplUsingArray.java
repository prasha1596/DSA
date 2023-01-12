import java.util.EmptyStackException;

public class StackImplUsingArray {
    // Implement a Stack using Array
    // push(int), pop(), peek() operations
    private int capacity;
    private int[] stackArray;
    private int top;

    StackImplUsingArray(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1)
            throw new StackOverflowError();
        stackArray[++top] = element;
    }

    public int pop() {
        if (top == -1)
            throw new EmptyStackException();
        int elementToBeRemoved = stackArray[top];
        top--;
        return elementToBeRemoved;
    }

    public int peek() {
        if (top == -1)
            throw new EmptyStackException();
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackImplUsingArray stack = new StackImplUsingArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
