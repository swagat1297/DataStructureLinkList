
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
	public void addingSelectedPosition(MyNode<E> mySelectedNode, MyNode<E> valueNode) {
        MyNode<E> tempNode = (MyNode<E>) this.head;
        while (!tempNode.getNext().equals(mySelectedNode.getNext())) {
            tempNode = (MyNode<E>) tempNode.getNext();
        }
        valueNode.setNext(tempNode.getNext());
        tempNode.setNext(valueNode);
    }
		
}
