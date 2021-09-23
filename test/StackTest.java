import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {
    
    @Test 
    public void TestIsEmpty(){
        // Set up
        Stack myStack = new Stack();
        assertEquals(true, myStack.isEmpty());

        myStack.push(1);
        assertEquals(false, myStack.isEmpty());
    }
}
