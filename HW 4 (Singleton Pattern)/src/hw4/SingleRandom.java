package hw4;

public class SingleRandom {
	private static SingleRandom instance = new SingleRandom();
	
	private SingleRandom(){}
	
	public static SingleRandom getInstance(){
		return instance;
	}
	public void showRandom(){
		 int rando = (int) Math.ceil(Math.random() * 100);
		 System.out.println(rando);
	}

}
