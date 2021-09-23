import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class StackTest {
    
    @Test 
    public void testIsEmpty(){
        Stack myStack = new Stack();
        assertEquals(true, myStack.isEmpty());

        myStack.push(1);
        assertEquals(false, myStack.isEmpty());
    }

    @Test
    public void testPush(){
        Stack myStack = new Stack();
        assertEquals(true, myStack.push(0));
        for(int i = 1; i <= 999; i++){
            myStack.push(i);
        }
        assertEquals(false, myStack.push(1000));
    }

    @Test
    public void testPop(){
        Stack myStack = new Stack();
        assertEquals(0, myStack.pop());

        myStack.push(10);
        myStack.push(5);
        assertEquals(5, myStack.pop());
        assertNotEquals(5, myStack.pop());
        
    }
    
    @Test
    public void testPeek(){
        Stack myStack = new Stack();
        assertEquals(0, myStack.peek());

        myStack.push(10);
        assertEquals(10, myStack.peek());
        assertNotEquals(5, myStack.peek());
    }

    @Test
    public void testPrint(){
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        myStack.print();

        String expected = "Elements currently present in Stack:\n2\n1";
        assertEquals(expected, outContent.toString());
    }
}
