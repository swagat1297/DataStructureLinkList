
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
		
}
