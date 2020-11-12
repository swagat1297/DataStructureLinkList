

public class MyNode<E> implements INodei<E> {
	private E key;
	private MyNode next;
	
	public MyNode(E key) {
		this.key = key;
		this.next = null;
	}
	
	public INodei<E> getNext(){
		return next;
	}
	
	public E getKey() {
		return key;
	}
	
	public void setKey(E key) {
		this.key = key;
	}
	
	@Override
	public void setNext(INodei next) {
		this.next = (MyNode<E>) next;
	}




}
