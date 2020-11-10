
public class MyNode<E> {
	private E key;
	private MyNode next;
	
	public MyNode(E key) {
		this.key = key;
		this.next = null;
	}
	
	public MyNode getNext() {
	        return next;
	}
	 
	public void setNext(MyNode next) {
	    this.next = next;
	}
	

}
