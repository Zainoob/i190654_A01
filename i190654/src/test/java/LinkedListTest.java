import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;


class LinkedListTest {

	@Test
	//Testing the pushfront function
	void test1() {
		LinkedList list = new LinkedList();
		
		list.pushFront(1); //inserting value at front
		
		assertNotNull(list.head);
		assertEquals(list.head.key,1); //1 inserted at head position
		
		list.display(); //displaying inserted values
		
		list.pushFront(2); //inserting value at front at head position. 
		assertEquals(list.head.key,2); //Should push 2 at head position. Should push 1 to the back
		assertEquals(list.head.next.key,1); //1 has been pushed to the back
		
		
		list.display(); //displaying inserted values
		
	}
	
	@Test
	//Testing the pushback function
	void test2() {
		LinkedList list = new LinkedList();
		
		list.pushBack(1); //inserting value at front
		
		assertNotNull(list.head);
		assertEquals(list.head.key,1); //1 inserted at head position
		
		list.display(); //displaying inserted values
		
		list.pushBack(2); //inserting value at end of list. 
		assertEquals(list.head.key,1); //1 should stay at head position
		assertEquals(list.head.next.key,2); //2 has been added at the end of the list
		
		
		list.display(); //displaying inserted values
		
	}
	
	@Test
	//Testing the list ordering
	void test3() {
		LinkedList list = new LinkedList();
		boolean equal=true;
		
		//adding some values in order
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		
		list.display();
		
		
		//adding some values in arrays in order
		int [] arr= {1,2,3,4,5};
		
		
		//checking values of list corresponding to array;
		for(int i=0;i<5;i++)
		{
			assertEquals(list.head.key,arr[i]);
			list.head=list.head.next;
		}
		
	}
	@Test
	//Testing the links between list
	void test4() {
		LinkedList list = new LinkedList();
		//no values added to list
		assertNull(list.head);
		
		//one value added to list
		list.pushFront(1);
		assertNotNull(list.head);
		
		//second position in list should be null
		assertNull(list.head.next);
		
		list.display(); //displaying inserted values
		
	}
	
	@Test
	//Testing the links between list
	void test5() {
		LinkedList list = new LinkedList();
		//no values added to list
		assertNull(list.head);
		
		//one value added to list
		list.pushFront(1);
		assertNotNull(list.head);
		
		//second position in list should be null
		assertNull(list.head.next);
		
		list.display(); //displaying inserted values
		
	}
	
	@Test
	//Testing the popfront between list
	void test6() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);

		list.display(); //displaying inserted values
		
		//checking how value at front position changes with each popfront implementation
		assertEquals(list.head.key,5);
		list.popFront();
		assertEquals(list.head.key,4);
		list.popFront();
		assertEquals(list.head.key,3);
		list.popFront();
		assertEquals(list.head.key,2);
		list.popFront();
		assertEquals(list.head.key,1);
		list.popFront();
		assertNull(list.head);
		
	}
	
	@Test
	//Testing the popfront between list
	void test7() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);

		list.display(); //displaying inserted values
		
		//checking if value at front position changes with each popback implementation. It doesnot
		assertEquals(list.head.key,1);
		list.popBack();
		assertNotNull(list.head);
		list.display();
		
		assertEquals(list.head.key,1);
		list.popBack();
		assertNotNull(list.head);
		list.display();
		
		assertEquals(list.head.key,1);
		list.popBack();
		assertNotNull(list.head);
		list.display();
		
		assertEquals(list.head.key,1);
		list.popBack();
		assertNotNull(list.head);
		list.display();
		
		assertEquals(list.head.key,1);
		list.popBack();
		assertNull(list.head);
		list.display();
	}
	
	@Test
	//Testing the pop between list
	void test8() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);

		list.display(); //displaying inserted values

		
		//popping values from list in order
		list.pop(5);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(4);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(3);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(2);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(1);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(0);
		list.display(); //displaying values
		
		//head position should be null as list is empty
		assertNull(list.head);
		
	}
	@Test
	//Testing the pop between list with random order.Test DOES NOT Pass
	void test81() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);

		list.display(); //displaying inserted values

		
		//popping values from chosen position from list in random order
		list.pop(5);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(3);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(1);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(2);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(4);
		assertNotNull(list.head);
		list.display(); //displaying values
		list.pop(0);
		list.display(); //displaying values
		
		//head position should be null as list is empty
		assertNull(list.head);
		
	}
	
	@Test
	//Testing the pop between list
	void test9() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		list.pushFront(5);

		list.display(); //displaying inserted values

		
		// Attempting to pop values from list that don't exist
		assertNotNull(list.head);
		list.pop(6);
		list.pop(7);
		list.pop(8);
		list.pop(9);
		list.pop(10);
		
		assertNotNull(list.head);

	}
	
	@Test
	//Testing the display function
	void test10() {
		LinkedList list = new LinkedList();
		//no values added to list
		list.display();
		list.pushFront(1);
		list.display();
		list.pushFront(2);
		list.display();
		list.pushFront(3);
		list.display();
		list.pushFront(4);
		list.display();
		list.pushFront(5);
		list.display(); //displaying inserted values

		
		//popping values from chosen position from list in random order
		list.pop(5);
		list.display(); //displaying values
		list.pop(4);
		list.display(); //displaying values
		list.pop(3);
		list.display(); //displaying values
		list.pop(2);
		list.display(); //displaying values
		list.pop(1);
		list.display(); //displaying values
		list.pop(0);
		list.display(); //displaying values
		
		assertNull(list.head);

	}

}
