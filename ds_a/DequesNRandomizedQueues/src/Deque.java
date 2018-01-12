import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
	
	private class Node<Item> {
		private Item item;
		private Node<Item> next;
	}
	
	private int size;
	private Node<Item> first;
	private Node<Item> last;
	
	public Deque() {
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirst(Item item) {
		if(item != null) {
			
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void addLast(Item item) {
		if (item != null) {
			
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public Item removeFirst() {
		
	}
	
	public Item removeLast() {
		
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
