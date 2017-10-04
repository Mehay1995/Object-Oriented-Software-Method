
interface Collection<E> {
	
	Iterator<E>	iterator();
	void add(E x);
	default boolean isEmpty() {
		return true;
	}	
	default int size() {
		return 0;
	}
	
}
