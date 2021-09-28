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
}