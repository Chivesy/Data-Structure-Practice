
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
     * Function to insert a new Node to the front of the linked list.
     * @param newData integer data to be added to new Node being added to Linked List.
     */
    public void addToFront(int newData){
        Node newNode = new Node(newData);
        
        newNode.next = head;    //Next pointer now points to current head;
        head = newNode;         //Adjust head 
        System.out.println(newData + ": added to Linked List");
    }
    /**
     * Function to insert a new Node after a given node in list.
     * @param prevNode pointer to node in linked list we want to add a new Node after.
     * @param newData integer data to be added to new Node being added to Linked List.
     */
    public void insertAfter(Node prevNode, int newData){
        if (prevNode == null){
            System.out.println("Provided node can not be null");
            return;
        }
        Node newNode = new Node(newData);   //Allocate Node and add data
        newNode.next = prevNode.next;       
        prevNode.next = newNode;
        System.out.println(newData + ": added to Linked List");            
    }

    /**
     * Function to insert a new Node at the end of the Linked List.
     * @param newData integer data to be added to new Node being added to linked List.
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
        System.out.println(newData + ": added to Linked List");
        return;
    }

    /**
     * Function to delete key (integer data) from linked list. 
     * @param keyData data to find and remove from linked list. Removes first occurence.
     */
    public void deleteKey(int keyData){
        //Check if headnode needs to be deleted
        if(head != null && head.data == keyData){
            head = head.next;
            return;
        }

        //Iterate through linked list
        Node curNode = head;
        Node prev = null;
        while(curNode != null && curNode.data != keyData){
            prev = curNode;
            curNode = curNode.next;
        }

        // Key was not found in Linked List
        if(curNode == null){
            System.out.println(keyData + ": Not found in linked list.");
            return;
        }
        //Unlink the node from linked list
        prev.next = curNode.next;
        System.out.println(keyData + ": Removed from linked list.");
    }
    /** Function to delete current linked list */
    public void deleteList(){
        head = null;
        System.out.println("Linked list deleted");
    }

    /**
     * Function to return current length of the Linked List.
     * @return returns an integer of current length of the Linked List.
     */
    public int listLength(){
        int count = 0;
        Node curNode = head;
        while(curNode != null){
            count++;
            curNode = curNode.next;
        }
        return count;
    }
    /**
     * Function to return current length of the Linked List (Recursive)
     * @param head Pointer to the head node of the Linked List.
     * @return returns an integer of current length of the Linked List.
     */
    public int recListLength(Node head){
        if(head == null){
            return 0;
        }
        return 1 + recListLength(head.next);
    }

    /**
     * Function to return if a Key exists in the Linked List
     * @param keyData Key or Data that we are searching for in Linked List.
     * @return returns true if key found, otherwise false.
     */
    public boolean search(int keyData){
        Node curNode = head;
        while (curNode != null){
            if (curNode.data == keyData){
                return true;
            }
            curNode = curNode.next;
        }
        return false;
    }

    /** Function sorts the current Linked List in ascending order */
    public void sortBubble(){
        Node curNode = head;
        Node nextNode = null;
        int temp;   //holds the values while we swap data

        // empty list nothing to sort
        if (head == null){
            return;
        }

        while (curNode != null){
            nextNode = curNode.next;

            while(nextNode != null){
                if (curNode.data > nextNode.data){
                    temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                    
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
    }

    /**
     * Function adds a new Node into the Linked in ascending order
     * @param newData Data to be added into the linked list.
     */
    public void sortedInsert(int newData){
        Node newNode = new Node(newData);

        if (head.data > newNode.data){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null && curNode.next.data < newData){
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }
}
