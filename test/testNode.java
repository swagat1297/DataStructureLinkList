import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;



public class testNode {

	@Test
	public void addingGiven3LinkListOnTop() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		newLinkList LinkList = new newLinkList();
		newLinkList.add(firstNode);
		newLinkList.add(secondNode);
		newLinkList.add(thirdNode);
		boolean result = newLinkList.head.equals(thirdNode) &&
						 newLinkList.head.getNext().equals(secondNode) &&
						 newLinkList.tail.equals(firstNode);
		Assert.assertTrue(result);

	}
	 @Test
	    public void insertingValueToThreeNodeInAlreadyDefinedLinkList()
	    {
	        MyNode<Integer> firstNode = new MyNode<>(56);
	        MyNode<Integer> secondNode = new MyNode<>(70);
	        MyNode<Integer> insertNode = new MyNode<>(30);
	        newLinkList newLinkList = new newLinkList();
	        newLinkList.addAtLast(firstNode);
	        newLinkList.addAtStart(secondNode);
	        
	        newLinkList.addAtSelectedPosition(firstNode, insertNode);

	        boolean newLinkListCreated = newLinkList.start.equals(firstNode) &&
	                newLinkList.start.getNext().equals(insertNode) &&
	                newLinkList.last.equals(secondNode);
	        Assert.assertTrue(newLinkListCreated);
	    }
	 @Test
		public void appendingThreeValuesToLinkedList() {
			MyNode<Integer> firstNode = new MyNode<>(56);
			MyNode<Integer> secondNode = new MyNode<>(30);
			MyNode<Integer> thirdNode = new MyNode<>(70);
			
			newLinkList newLinkedList = new newLinkList();
			
			newLinkedList.add(firstNode);
			newLinkedList.append(secondNode);
			newLinkedList.append(thirdNode);
			
			newLinkedList.printNodeAfterAppending();
			boolean result = newLinkedList.head.equals(firstNode) &&
							 newLinkedList.head.getNext().equals(secondNode) &&
							 newLinkedList.tail.equals(thirdNode);
			Assert.assertTrue(result);
		}
	 @Test
		public void firstValueDeletedFromLinkedList() {
			MyNode<Integer> firstNode = new MyNode<>(56);
			MyNode<Integer> secondNode = new MyNode<>(30);
			MyNode<Integer> thirdNode = new MyNode<>(70);
			
			newLinkList newLinkedList = new newLinkList();
			
			newLinkedList.add(firstNode);
			newLinkedList.append(thirdNode);
			newLinkedList.insert(firstNode, secondNode);
			
			INodei result = newLinkedList.pop();
			newLinkedList.printNodeAfterAppending();
			Assert.assertEquals(firstNode, result);
		}
	 @Test
		public void lastValueDeletedFromLinkedList() {
			MyNode<Integer> firstNode = new MyNode<>(56);
			MyNode<Integer> secondNode = new MyNode<>(30);
			MyNode<Integer> thirdNode = new MyNode<>(70);
			
			newLinkList newLinkedList = new newLinkList();
			
			newLinkedList.add(firstNode);
			newLinkedList.append(secondNode);
			newLinkedList.append(thirdNode);
			
			INodei result = newLinkList.popLast();
			newLinkedList.printPopLast();
			Assert.assertEquals(thirdNode, result);
		}
	 

}
