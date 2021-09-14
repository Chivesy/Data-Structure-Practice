/**
 * Driver program to run basic stack data structure program.
 */
public class Main {
    /** Main program to run basic stack data structure program.
     *  @param args no arguments required.
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.peek();
        s.print();
        Boolean empty = s.isEmpty();
        System.out.println("The Stack is currently empty: " + empty);
    }
}

