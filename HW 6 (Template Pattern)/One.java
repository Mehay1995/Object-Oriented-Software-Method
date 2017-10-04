import java.util.Arrays;

public class One {
	
  public static void main(String[] args) {
	  
    Integer[] values = new Integer[args.length];
    for (int i = 0; i < values.length; i++)
      values[i] = Integer.parseInt(args[i]);
    System.out.println( Arrays.toString( values ) );
    Two<Integer> t = new Two<>();
    t.sort( values ); 
    System.out.println( Arrays.toString( values ) );   
    
  }
  
}