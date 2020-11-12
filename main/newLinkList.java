
public class newLinkList<E> {
	public INodei tail;
	public INodei head;
	
	public newLinkList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INodei valueNode) {
		if(this.head == null) {
			this.head = valueNode;
		}
		if(this.tail == null) {
			this.tail = valueNode;
		}
		else {
			INodei nextNodei = this.head;;
			this.head = valueNode;
			this.head.setNext(nextNodei);
		}
	}
	public INodei append(INodei valueNode){
		if(this.head == null) {
			this.head = valueNode;
		}
		if(this.tail == null) {
			this.tail = valueNode;
		}
		else {
			INodei tempNode = this.head;
			this.head = head.getNext();
			return tempNode;
		}
		return valueNode;
	}
	public INodei pop() {
		
		INodei tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	public INodei popLast() {
		
		INodei tempNode = this.head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;	
	}
	public void insert(INodei myNode, INodei newNode) {
		INodei tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public MyNode RemoveFromStart() {
	        MyNode tempNode = (MyNode) this.head;
	        this.head = head.getNext();
	        return tempNode;
	    }
	public void printNodeAfterAppending() {
		StringBuffer newNodes = new StringBuffer("Nodes ");
		INodei tempNode = head;
		while(tempNode.getNext() != null) {
			newNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) newNodes.append("->");
			tempNode = tempNode.getNext();
		}
		newNodes.append(tempNode.getKey());
		System.out.println(newNodes);
	}
	public void printPopLast() {
		StringBuffer myNodes = new StringBuffer("Nodes : ");
		INodei tempNode = head;
		while(tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) {
				myNodes.append("->");
			}
				tempNode = tempNode.getNext();
		}
		System.out.println(myNodes);
	}
		
}
