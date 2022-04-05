public class MainProg {
    public static void main(String[] args) {
        LinkedListImplStack<Integer> myStack = new LinkedListImplStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack);
        System.out.println(myStack.peek());
    }
}
