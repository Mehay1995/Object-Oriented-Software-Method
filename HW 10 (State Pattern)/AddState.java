
public class AddState implements State {
	
	Quote quote;
	
	public AddState (Quote quote) {
		this.quote = quote;
	}
	
	public void Create() {
		quote.setState(quote.getListState());
	}
	
}
