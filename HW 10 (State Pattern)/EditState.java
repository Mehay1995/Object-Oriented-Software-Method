
public class EditState implements State{

	Quote quote;
	
	public EditState (Quote quote) {
		this.quote = quote;
	}
	
	public void Update() {
		quote.setState(quote.getListState());
	}
	
	public void Delete() {
		quote.setState(quote.getListState());
	}
	
}
