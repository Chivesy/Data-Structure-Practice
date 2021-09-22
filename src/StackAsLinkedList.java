
/** 
 * The class StackAsLinkedList to create and implement a stack data structure using Linked Lists
 * @author Joseph Larson
 */
public class StackAsLinkedList {
    /**
     * The root is the highest item in the stack
     */
    private StackNode root;
    static class StackNode {
        int data;
        StackNode next;

        /**
         * Constructor of a StackNode for linked list
         * @param data integer value stored in a stack node.
         */
        StackNode(int data) {
            this.data = data;
        }
    }

    /**
     * Checks if the stack is empty
     * @return False: stack not empty. True: stack is empty
     */
    public boolean isEmpty(){
        if(root == null){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Adds an item to the stack linked list data structure.
     * @param data integer value being added to stack
     */
    public void push(int data){
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed onto the stack");
    }

    /**
     * Removes an item from the stack linked list data structure.
     * @return integer data value of the removed stack item.
     */
    public int pop(){
        if(root == null){
            System.out.println("Stack is currently Empty");
            return Integer.MIN_VALUE;
        } else {
            int popped = root.data;
            root = root.next;
            return popped;
        }
    }

    /**
     * Looks at the current item at the top of the linked list data structure.
     * @return integer data value of the top most item in the stack.
     */
    public int peek(){
        if(root == null){
            System.out.println("Stack is currently Empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    /**
     * Prints out all the values currently in the linked list stack.
     */
    public void print() {
        if(root == null){
            System.out.println("Stack is currently Empty");
        } else {
            System.out.println("Elements currently present in Stack: ");
            StackNode cur = root;
            while (cur != null){
                System.out.println(cur.data);
                cur = cur.next;
            }
        }
    }
}
