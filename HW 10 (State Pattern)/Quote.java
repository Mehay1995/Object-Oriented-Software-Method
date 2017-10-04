
public class Quote {

	
	private State addState;
	private State editState;
	private State listState;
	private State randomState;
	
	State state = new RandomState(this);
	
	void setState(State state) {
		addState = new AddState(this);
		editState = new EditState(this);
		listState = new ListState();
		randomState = new RandomState(this);
		this.state = state;
	}
	
	
	public State getState() {
		return this.state;
	}
 
	public State getAddState() {
		return this.addState;
	} 
	
	public State getEditState() {
		return this.editState;
	} 
	
	public State getRandomState() {
		return this.randomState;
	} 
	public State getListState() {
		return this.listState;
	} 
}
