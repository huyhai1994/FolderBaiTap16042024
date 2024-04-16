import alinkedlist.LinkedListSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSelfTest {

    @Test
    void testInitialState() {
        LinkedListSelf linkedList = new LinkedListSelf();
        assertEquals(0, linkedList.size);
        assertNull(linkedList.head);
        assertNull(linkedList.tail);
    }

    @Test
    void testInsertFirst() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        assertEquals(1, linkedList.size);
        assertEquals("A", linkedList.head.info);
        assertNull(linkedList.tail);
    }

    @Test
    void testInsertLast() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertLast("A");
        assertEquals(1, linkedList.size);
        assertEquals("A", linkedList.tail.info);
        assertEquals("A", linkedList.head.info);
    }

    @Test
    void testDeleteFirst() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        linkedList.insertFirst("B");
        assertEquals(2, linkedList.size);
        linkedList.deleteFirst();
        assertEquals(1, linkedList.size);
        assertEquals("B", linkedList.head.info);
        assertNull(linkedList.tail);
    }

    @Test
    void testDeleteLast() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        linkedList.insertFirst("B");
        assertEquals(2, linkedList.size);
        linkedList.deleteLast();
        assertEquals(1, linkedList.size);
        assertEquals("A", linkedList.head.info);
        assertNull(linkedList.tail);
    }
}