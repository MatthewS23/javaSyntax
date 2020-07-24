package solutionpack;

import org.junit.After;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class listsTestJUnit {
//Alt insert command to create a test method
    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void getPrivateLinkedList() {
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        lists.setlists();
        assertIterableEquals(testList, lists.getClassLinkedList());
    }

    @Test
    public void deleteNode() {
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(1);
        testList.add(3);
        assertIterableEquals(testList, lists.deleteNode(2));
    }

    @Test
    public void removeNthNode() {
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(1);
        testList.add(3);
        assertIterableEquals(testList, lists.removeNthNode(1));
    }

    @Test
    public void reverseLinkedList() {
        LinkedList<Integer> testList = new LinkedList<Integer>();
        testList.add(3);
        testList.add(2);
        testList.add(1);
        assertIterableEquals(testList, lists.reverseLinkedList());
    }


    @Test
    public void main() {
    }
}