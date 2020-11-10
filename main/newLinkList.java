
public class newLinkList {
	public INode tail;
	public INode head;
	
	public newLinkList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			INode nextNode = this.head;
			this.head = newNode;
			this.head.setNext(nextNode);
		}
		
	}
	

}
