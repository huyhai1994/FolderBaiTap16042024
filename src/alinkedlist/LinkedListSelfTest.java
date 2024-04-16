package alinkedlist;

import alinkedlist.LinkedListSelf;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListSelfTest {

    @Test
    void testInitialState() {
        LinkedListSelf linkedList = new LinkedListSelf();
        assertEquals(0, LinkedListSelf.numberOfNodes);
        assertNull(linkedList.head);
        assertNull(linkedList.tail);
    }

    @Test
    void testInsertFirst() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        assertEquals(1, LinkedListSelf.numberOfNodes);
        assertEquals("A", linkedList.head.info);
        assertNull(linkedList.tail);
    }

    @Test
    void testInsertLast() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertLast("A");
        assertEquals(1, LinkedListSelf.numberOfNodes);
        assertEquals("A", linkedList.tail.info);
        assertEquals("A", linkedList.head.info);
    }

    @Test
    void testDeleteFirst() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        linkedList.insertFirst("B");
        assertEquals(2, LinkedListSelf.numberOfNodes);
        linkedList.deleteFirst();
        assertEquals(1, LinkedListSelf.numberOfNodes);
        assertEquals("B", linkedList.head.info);
        assertNull(linkedList.tail);
    }

    @Test
    void testDeleteLast() {
        LinkedListSelf linkedList = new LinkedListSelf();
        linkedList.insertFirst("A");
        linkedList.insertFirst("B");
        assertEquals(2, LinkedListSelf.numberOfNodes);
        linkedList.deleteLast();
        assertEquals(1, LinkedListSelf.numberOfNodes);
        assertEquals("A", linkedList.head.info);
        assertNull(linkedList.tail);
    }
}