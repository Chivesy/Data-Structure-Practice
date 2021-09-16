/** The class SingleLinked list to create and implement a Single Linked List data structure
 * @author Joseph Larson
 */
public class SingleLinkedList {
    Node head; //head of linked list

    /** Single Linked List Node. Inner class is static so main() can access */
    static class Node {
        int data;
        Node next;

        /**
         * Constructor to create a new node in a Single Linked List.
         * @param data integer data value inside the node.
         */
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    /** Function prints out contents of the linked list starting from head node. */
    public void printLinkedList(){
        if(head == null){
            System.out.println("Linked List currently empty");
        }
        Node curNode = head;
        while(curNode != null){
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }
    }
    /**
     * Function to insert a new Node to the front of the linked list
     * @param newData integer data to be added to new Node being added to Linked List
     */
    public void addToFront(int newData){
        Node newNode = new Node(newData);
        
        newNode.next = head;    //Next pointer now points to current head;
        head = newNode;         //Adjust head 
    }
    /**
     * Function to insert a new Node after a given node in list.
     * @param prevNode
     * @param newData
     */
    public void insertAfter(Node prevNode, int newData){
        if (prevNode == null){
            System.out.println("Provided node can not be null");
            return;
        }
        Node newNode = new Node(newData);   //Allocate Node and add data
        newNode.next = prevNode.next;       
        prevNode.next = newNode;            
    }

    /**
     * Function to inert a new Node at the end of the Linked List
     * @param newData
     */
    public void insertEnd(int newData){
        Node newNode = new Node(newData);
        // Check if linkedlist is empty
        if(head == null){
            head = newNode;
        }
        Node cur = head;

        // Traverse the Linked List to find last node
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
        newNode.next = null;
        return;
    }
}
