package ds.doublyLinkedList;

public class DoublyLinkedList {

    private Node first;

    private Node last;

    public void insertFirst(int data) {
        final Node node = new Node();
	node.data = 10;
	if (!isEmpty()) {

	}

	first = node;

    }

    public boolean isEmpty() {
	return first == null;
    }
}
