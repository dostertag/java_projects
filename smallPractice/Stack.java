public class Stack<Item>
{
	private Node first = null;

	private Class Node
	{
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}
		
	public void push(Item item)
	{
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public Item pop()
	{
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	// not so good:
	public class FixedCapacityStack<Item>
	{
		private Item[] s;
		private int N = 0;
		
		public FixedCapacityStack(int capacity)
		{
			s = (Item[]) new Item[capacity];  // good code has ZERO casts!
		}

		public boolean isEmpty() 
		{
			return N == 0;
		}

		public void push(Item item)
		{
			s[N++] = item;
		}

		public void pop() 
		{
			return s[--N];
		}
	}
}
