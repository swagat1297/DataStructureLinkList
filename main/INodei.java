

public interface INodei<E> {
	E getKey();
	void setKey(E key);
	
	INodei getNext();
	void setNext(INodei next);

}
