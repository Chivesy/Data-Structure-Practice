/**
 * Driver program to run stack data structure programs. Array and Linked List implementations.
 * @author Joseph Larson
 */
 public class Main {
    /** Main program to run various data structure programs. 
     * Currently have the following data structures implemented:
     * Stack with array, Stack with Linked List, Single Linked List
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

        // Testing the Linked List Implementation of a Stack
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

        // Testing Linked List Implementation
        System.out.println("\nImplementation of a Linked List\n");
        SingleLinkedList sll = new SingleLinkedList();
        int length = sll.listLength();
        System.out.println("LinkedList current length is: " + length);
        length = sll.recListLength(sll.head);
        System.out.println("(Recursive) LinkedList current length is: " + length);
        sll.printLinkedList();
        sll.addToFront(5);
        sll.insertEnd(15);
        sll.insertEnd(20);
        sll.addToFront(1);
        length = sll.listLength();
        System.out.println("LinkedList current length is: " + length);
        length = sll.recListLength(sll.head);
        System.out.println("(Recursive) LinkedList current length is: " + length);
        SingleLinkedList.Node test = sll.head.next;
        sll.insertAfter(test, 10);
        // sll.insertAfter(sll.head.next, 10);
        System.out.println("10 in the Linked List: " + sll.search(10));
        System.out.println("82 in the Linked List: " + sll.search(82));
        sll.printLinkedList();
        sll.deleteKey(3);
        sll.deleteKey(15);
        sll.printLinkedList();
        sll.deleteList();
        sll.printLinkedList();

        // Testing sort
        sll.addToFront(100);
        sll.insertEnd(25);
        sll.insertEnd(60);
        sll.addToFront(500);
        sll.printLinkedList();
        System.out.println("Checking that sort method works");
        sll.sortBubble();
        sll.printLinkedList();
        System.out.println("Checking sortedInsert method");
        sll.sortedInsert(50000);
        sll.sortedInsert(30);
        sll.sortedInsert(10);
        sll.printLinkedList();

        //Testing DoubleLinkedList
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFront(10);
        dll.insertFront(9);
        dll.insertFront(8);
        dll.insertEnd(11);
        dll.insertEnd(12);
        dll.insertBefore(dll.head.next, 100);
        dll.insertAfter(dll.head.next, 50);
        dll.deleteNode(dll.head);
        dll.printList();
        System.out.println("5 is in the list: " + dll.containsElement(5));
        System.out.println("10 is in the list: " + dll.containsElement(10));
        System.out.println("Sorting the double linked list in ascending order");
        dll.sortListAscending();
        dll.printList();
        System.out.println("Sorting the double linked list in descending order");
        dll.sortListDescending();
        dll.printList();

        System.out.println("Merging two linked lists");
        DoubleLinkedList l2 = new DoubleLinkedList();
        l2.insertEnd(0);
        l2.insertEnd(2);
        l2.insertEnd(4);
        l2.printList();
        dll.sortListAscending();

        DoubleLinkedList.Node mergedHead = DoubleLinkedList.mergeTwoLists(dll.head, l2.head);
        // DoubleLinkedList.print(mergedHead);
        l2.head = mergedHead;
        dll.printList();
        l2.printList();





    }
}
