import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class StackAsLinkedListTest {
    @Test
    public void testIsEmpty(){
        StackAsLinkedList myStack = new StackAsLinkedList();
        boolean result = myStack.isEmpty();
        assertEquals(true, result);

        myStack.push(5);
        result = myStack.isEmpty();
        assertEquals(false, result);
    }

    @Test
    public void testPush(){
        StackAsLinkedList myStack = new StackAsLinkedList();
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myStack.push(50);
        String result = outContent.toString();
        String expected = "50 pushed onto the stack\n";
        assertEquals(expected, result);
    }

    @Test
    public void popTest(){
        StackAsLinkedList myStack = new StackAsLinkedList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        int numResult = myStack.pop();
        String result = outContent.toString();
        String expected = "Stack is currently Empty\n";
        assertEquals(expected, result);
        assertEquals(Integer.MIN_VALUE, numResult);

        myStack.push(5);
        numResult = myStack.pop();
        assertEquals(5, numResult);
    }

    @Test
    public void peekTest(){
        StackAsLinkedList myStack = new StackAsLinkedList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myStack.peek();
        String result = outContent.toString();
        String expected = "Stack is currently Empty\n";
        assertEquals(expected, result);

        myStack.push(2);
        myStack.push(3);

        int data = myStack.peek();
        assertEquals(3, data);
    }

    @Test
    public void printTest(){
        StackAsLinkedList myStack = new StackAsLinkedList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        myStack.print();
        String result = outContent.toString();
        String expected = "Stack is currently Empty\n";
        assertEquals(expected, result);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        outContent.reset();
        myStack.print();
        result = outContent.toString();
        expected = "Elements currently present in Stack: \n3\n2\n1\n";
        assertEquals(expected, result);
    }
}
