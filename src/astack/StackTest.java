package astack;

public class StackTest {
    public static void main(String[] args) {
        Stack stackSelf = new Stack();
        stackSelf.push(1);
        stackSelf.push(2);
        stackSelf.push(3);
        stackSelf.push(4);
        stackSelf.pop();
        stackSelf.pop();
        stackSelf.pop();
        System.out.println(stackSelf.peek());
    }
}
