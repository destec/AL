package Collctions;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by catalystx on 2016/11/6.
 */
// Almost the same as LinkedListStack
public class LinkedListBag<Item> implements Iterable<Item>{
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        N++;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {}

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
