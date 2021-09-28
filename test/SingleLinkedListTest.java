import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class SingleLinkedListTest {
    @Test
    public void printLinkedListTest(){
        SingleLinkedList myList = new SingleLinkedList();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        myList.printLinkedList();

        String result = outContent.toString();
        String expected = "Linked List currently empty";

        assertEquals(expected, result);
        myList.addToFront(5);
        myList.addToFront(10);
        outContent.reset();

        myList.printLinkedList();
        result = outContent.toString();
        expected = "10, 5\n";
        assertEquals(expected, result);

    }

    @Test
    public void addToFrontTest(){
        SingleLinkedList myList = new SingleLinkedList();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        myList.addToFront(10);

        String result = outContent.toString();
        String expected = "10: added to Linked List\n";
        assertEquals(expected, result);
    }

    @Test
    public void insertEndTest(){
        SingleLinkedList myList = new SingleLinkedList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        myList.insertEnd(10);

        String result = outContent.toString();
        String expected = "10: added to Linked List\n";
        assertEquals(expected, result);

        myList.addToFront(15);
        myList.insertEnd(50);

        outContent.reset();
        myList.printLinkedList();
        result = outContent.toString();
        expected = "15, 10, 50\n";

        assertEquals(expected, result);
    }

    @Test
    public void deleteKeyTest(){
        SingleLinkedList myList = new SingleLinkedList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        myList.deleteKey(5);

        String result = outContent.toString();
        String expected = "5: Not found in linked list.\n";
        assertEquals(expected, result);

        myList.addToFront(1);
        myList.addToFront(3);
        outContent.reset();
        
        myList.deleteKey(3);
        result = outContent.toString();
        expected = "3: Removed from linked list.\n";
        assertEquals(expected, result);
    }
}