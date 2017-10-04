
public class HW3_Tester {
	
	public static <E> void main(String[] args) { 	
		
		Collection<Integer> ll = new LinkedList<>(); 	
		Collection<Integer> que = new Queue<>(); 	 	 	 	

		int[] a = new int[] {8,5,4,3,2,1,}; 	
		for (int x: a) { 		
			ll.add(x);
			que.add(x); 
		}
		
		Iterator<Integer> iterll =  ll.iterator(); 			 	 	
		Iterator<Integer> iterque = que.iterator();
		
		System.out.println(iterll.hasNext());
		System.out.println(iterque.hasNext());
		
	}
}
