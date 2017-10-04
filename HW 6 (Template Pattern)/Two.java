import java.util.Comparator; 

public class Two<E> implements Comparator<Integer> {
	
  public int compare(Integer first, Integer second) {
	  
    if (first % 2 == 0 && second % 2 == 1) 
      return -1; 
    else if (first % 2 == 1 && second % 2 == 0) 
      return 1; 
    else if (first % 2 == 0 && second % 2 == 0) 
      return first.compareTo(second); 
    else // if (first % 2 == 1 && second % 2 == 1) 
      return -first.compareTo(second); 
 
  }

	//@Override
  	public static <E extends Comparer<E>> void sort(E[] a) {
	    boolean sorted;
	    do {
	      sorted = true;
	      for (int i = 0; i < a.length - 1; i++) {
	        if ((a[i]).compare(a[i+1]) > 0) {
	          sorted = false;
	          E temp = a[i];
	          a[i] = a[i+1];
	          a[i+1] = temp;
	        }
	      }
	      //System.out.println( Two.toString(a) );
	    } while ( ! sorted );
	  }

  
}