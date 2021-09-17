/** The class DoubleLinkedList to create and implement a double 
 * linked list data structure.
 * @author Joseph Larson
 */
public class DoubeLinkedList {
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


}
