/**
 * Driver program to run basic stack datastructure program.
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.peek();
        s.print();
    }
}

