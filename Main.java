/**
 * Driver program to run stack data structure programs. Array and Linked List implementations.
 */
 public class Main {
    /** Main program to run stack data structure programs. Array and Linked List implementations.
     *  @param args no arguments required.
     */
    public static void main(String[] args) {

        // Testing the Array Implementation
        System.out.println("Implementation of a Stack with an Array\n");
        Stack s = new Stack();
        Boolean empty = s.isEmpty();
        System.out.println("The Stack is currently empty: " + empty);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.peek();
        s.print();
        empty = s.isEmpty();
        System.out.println("The Stack is currently empty: " + empty + "\n\n");

        // Testing the Linked List Implementation
        System.out.println("Implementation of a Stack with a Linked List\n");
        StackAsLinkedList sall = new StackAsLinkedList();
        empty = sall.isEmpty();
        System.out.println("The Stack is currently empty: " + empty);
        sall.isEmpty();
        sall.push(10);
        sall.push(20);
        sall.push(30);
        sall.push(40);
        sall.push(100);
        sall.pop();
        sall.pop();
        sall.peek();
        empty = sall.isEmpty();
        System.out.println("The Stack is currently empty: " + empty);
        sall.print();
    }
}

