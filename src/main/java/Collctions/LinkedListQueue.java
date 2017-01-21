package Collctions;

import java.util.Iterator;

/**
 * Created by catalystx on 2016/11/22.
 */
public class LinkedListQueue<Item> implements Iterable<Item> {
    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    private Node first;
    private Node last;
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

    public void enqueue(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = null;
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        N ++;
    }

    public Item dequeue() {
        if (isEmpty()) return null;
        Node node = first;
        first = first.next;
        N --;
        if (isEmpty()) {
            last = null;
        }
        return node.item;
    }

    public Iterator<Item> iterator() {
        return null;
    }
}
