
public class RandomState implements State {

	Quote quote;
	
	public RandomState (Quote quote) {
		this.quote = quote;
	}

	public void Home() {
		quote.setState(quote.getRandomState());
	}
	
	public void Admin() {
		quote.setState(quote.getListState());
	}
}
