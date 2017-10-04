
public class ListState implements State {
	
	Quote quote;
	
	public void Add() {
		quote.setState(quote.getAddState());
	}
	
	public void Home() {
		quote.setState(quote.getRandomState());
	}
	
	public void Update() {
		quote.setState(quote.getEditState());
	}
	
	public void Delete() {
		quote.setState(quote.getEditState());
	}
}
