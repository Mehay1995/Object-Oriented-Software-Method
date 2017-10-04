

public class LinkedList<E> implements Collection<E> {
	
	class Node {
	    E data;
	    Node next;
	    
	    Node(E data) {
	      this(data, null);
	    }
	    
	    Node (E data, Node next) {
	      this.data = data;
	      this.next = next;
	    }
	  }
	  
	  Node head;
	  int n;
	  
	public Iterator<E> iterator() {
		return new Iterator<E>() {
	  		
			public boolean hasNext() {
				return head.next != null;
			};
			
			public E next() {
				return (E) head.next;
			};
	  };
	}

	public void add(E x) {
		n++;
	    if (head == null) 
	      head = new Node((E) x);
	    else {
	      Node p = head;
	      while (p.next != null)
	        p = p.next;
	      p.next = new Node((E) x);
	    }
	 }
		

}
