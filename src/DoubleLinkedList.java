
/** The class DoubleLinkedList to create and implement a double 
 * linked list data structure.
 * @author Joseph Larson
 */
public class DoubleLinkedList {
    Node head;

    static class Node {
        int data;
        Node prev;
        Node next;
        
        /**
         * Constructor to create a new node in Double Linked List.
         * @param data integer data value stored inside the node.
         */
        Node(int data){
            this.data = data;
        }
    }

    /**
     * Function to insert a new Node to the front of the double linked list.
     * @param newData integer data to be added to the new Node being added to linked list.
     */
    public void insertFront(int newData){
        Node newNode = new Node(newData);

        //Push new node to head of list
        newNode.next = head;
        newNode.prev = null;

        //Adjust previous pointer for head node
        if (head != null){
            head.prev = newNode;
        }
        //Finally adjust head of Linked List to newNode being added
        head = newNode;
    }

    /**
     * Function to insert a new Node after a given node in Double Linked List.
     * @param prevNode pointer to node in double linked list, want to add a new Node after.
     * @param newData integer data to be added to new Node being added to Double Linked List.
     */
    public void insertAfter(Node prevNode, int newData){
        if(prevNode == null){
            System.out.println("Provided node can not be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        newNode.prev = prevNode;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    /**
     * Function to insert a new Node before a given node in Double Linked List.
     * @param nextNode pointer to a node in double linked list, want to add a new Node before.
     * @param newData integer data to be added to new Node being added to Double Linked List.
     */
    public void insertBefore(Node nextNode, int newData){
        if(nextNode == null){
            System.out.println("Provided node can not be null");
            return;
        }
        Node newNode = new Node(newData);

        //Adjust previous pointer
        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;

        //Adjust next pointers
        newNode.next = nextNode;
        if(newNode.prev != null){
            newNode.prev.next = newNode;
        } else {
            //Must be at head of list
            head = newNode;
        }
    }

    /**
     * Function to insert a new Node at the end of double linked list.
     * @param newData integer data to be added to new Node being added to double linked list.
     */
    public void insertEnd(int newData){
        Node newNode = new Node(newData);
        newNode.next = null;

        // Case that linked list is empty
        if(head == null){
            head = newNode;
            newNode.prev = null;
            return;
        }

        //Traversal until end of the double linked list
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        newNode.prev = curNode;
    }

    /**
     * Function to remove provided Node from the double linked list.
     * @param del node provided to be removed from linked list.
     */
    public void deleteNode(Node del){
        if (head == null || del == null){
            return;
        }

        //head node to be deleted
        if(head == del){
            head = del.next;
        }

        //Make sure its not last node before adjusting pointer
        if(del.next != null){
            del.next.prev = del.prev;
        }

        //Make sure its not first node before adjusting pointer
        if(del.prev != null){
            del.prev.next = del.next;
        }

        //Garbage collection will clean up rest.
        return;
    }

    /**
     * Function to check if an element is in the Double Linked List
     * @param data integer data to search linked list for.
     * @return true if found, false if element data not in linked list.
     */
    public boolean containsElement(int data){
        if (head == null){
            return false;
        }

        Node curNode = head;
        while(curNode != null){
            if(curNode.data == data){
                return true;
            }
            curNode = curNode.next;
        }
        return false;
    }

    public void sortListAscending(){
        Node curNode = head;
        Node nextNode = null;
        int temp; // variable to hold data while we swap.

        // empty list, nothing to sort.
        if(head == null){
            return;
        }

        // Bubble sort
        // Traverse list
        while (curNode != null){
            nextNode = curNode.next;

            // Traverse list, starting one ahead of pervious traversal
            while(nextNode != null){
                if(curNode.data > nextNode.data){
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    public void sortListDescending(){
        Node curNode = head;
        Node nextNode = null;
        int temp; // variable to hold data while we swap.

        // empty list, nothing to sort.
        if (head == null){
            return;
        }

        // Bubble sort
        // Traverse List
        while (curNode != null){
            nextNode = curNode.next;

            //Travse list, starting one ahead of previous traversal
            while(nextNode != null){
                if(curNode.data < nextNode.data){
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;

                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    public static Node mergeTwoLists(Node l1, Node l2){
        // New List
        Node result = new Node(-1);
  
        // Last node of the list.
        Node last = result;
  
        // Iterate the loop
        while (l1 != null && l2 != null) {
            // Find the smaller element and append it to the
            // list.
            if (l1.data <= l2.data) {
                last.next = l1;
                l1 = l1.next;
            } else {
                last.next = l2;
                l2 = l2.next;
            }
            // Update the variable
            last = last.next;
        }
  
        // If either list become empty append remaining list
        // element of other list.
        if (l1 == null) {
            last.next = l2;
        } else if (l2 == null) {
            last.next = l1;
        }

        // Return the resultant list without first extra node
        return result.next;
    }

    /**
     * Function to print all the values currently in the Double Linked List.
     */
    public void printList(){
        if(head == null){
            System.out.println("Double Linked List is currently empty");
        }

        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data);
            curNode = curNode.next;
            if(curNode != null){
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }

    public static void print(Node node){
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
