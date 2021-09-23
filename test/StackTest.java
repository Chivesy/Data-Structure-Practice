import static org.junit.Assert.assertEquals;

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

        myStack.push(5);
        assertEquals(5, myStack.pop());
    }
}
