

public class QueueOfStrings {
	
	private int size;
	
	QueueOfStrings() {
	}

	public void enqueue(String item) {
	
	}

	public String dequeue() {

	}

	public boolean isEmpty() {

	}
}


public class LinkedQueueOfStrings
{
	private Node first;
	private Node last;

	private class Node
	{ /* same as in StackOfStrings */ }
	
	public boolean isEmpty() {
		return first == null;
	}

	public void enqueue(String item) {
		Node oldlast = last;
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
	}

	public String dequeue() {
		String item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		return item;
	}
}
