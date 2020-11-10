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

}
