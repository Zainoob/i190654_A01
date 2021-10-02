import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTests {

	@Test
	//testing the push function 
	void test0() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(stack.head);
		//pushing 5 values into stack one by one and testing size of stack 
		stack.push(-10);   
		stack.display();
		assertNotNull(stack.head);
		
		stack.push(0);    
		stack.display();
		assertNotNull(stack.head);
		
		stack.push(1);      
		stack.display();
		assertNotNull(stack.head);
		
		stack.push(7);     
		stack.display();
		assertNotNull(stack.head);
		
		stack.push(1000);  
		stack.display();
		assertNotNull(stack.head);

	}
	@Test
	//Testing the push function by testing position of head after each insertion
	void test1() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one and testing the value of head
		stack.push(-10);       
		assertEquals(Stack.head.key,-10);
		stack.push(0);       
		assertEquals(Stack.head.key,0);
		stack.push(1);       
		assertEquals(Stack.head.key,1);
		stack.push(7);       
		assertEquals(Stack.head.key,7);
		stack.push(1000);       
		assertEquals(Stack.head.key,1000);
	}
	
	@Test
	//testing the display function 
	void test2() {
		Stack stack = new Stack(); //create new stack.
		
		assertEquals(stack.getSize(),0);
		stack.display();
		
		//pushing 5 values into stack one by one and testing size of stack 
		stack.push(-10);       
		stack.display();
		stack.push(0);       
		stack.display();
		stack.push(1);       
		stack.display();
		stack.push(7);       
		stack.display();
		stack.push(1000);       
		stack.display();
	}
	
	@Test
	//testing the pop function 
	void test3() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one
		stack.push(-10);       
		stack.push(0);       
		stack.push(1);       
		stack.push(7);       
		stack.push(1000);    
		
		//testing the order of the pop function
		assertEquals(stack.pop(),1000);
		assertEquals(stack.pop(),7);
		assertEquals(stack.pop(),1);
		assertEquals(stack.pop(),0);
		assertEquals(stack.pop(),-10);
		
		
	}
	@Test
	//testing the pop function 
	//attempting to pop more values then present in stack
	void test4() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one
		stack.push(-10);       
		stack.push(0);       
		stack.push(1);       
		stack.push(7);       
		stack.push(1000);    
		
		//testing the order of the pop function
		assertEquals(stack.pop(),1000);
		assertEquals(stack.pop(),7);
		assertEquals(stack.pop(),1);
		assertEquals(stack.pop(),0);
		assertEquals(stack.pop(),-10);	
		
		//confirming stack is empty
		assertNull(stack.head);
		assertEquals(stack.getSize(),0);
		//attempting to pop stack when it is empty
		stack.pop();
		stack.pop();
		
	}
	@Test
	//testing the top function 
	void test5() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one
		stack.push(-10);       
		stack.push(0);       
		stack.push(1);       
		stack.push(7);       
		stack.push(1000);    
		
		//testing the order of the pop function
		assertEquals(stack.top(),1000);
		stack.pop();
		assertEquals(stack.top(),7);
		stack.pop();
		assertEquals(stack.top(),1);
		stack.pop();
		assertEquals(stack.top(),0);
		stack.pop();
		assertEquals(stack.top(),-10);
		stack.pop();
		
		
	}
	@Test
	//testing the top function 
	//testing more values then present in stack
	void test6() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one
		stack.push(-10);       
		stack.push(0);       
		stack.push(1);       
		stack.push(7);       
		stack.push(1000);    
		
		//testing the order of the top function
		assertEquals(stack.top(),1000);
		stack.pop();
		assertEquals(stack.top(),7);
		stack.pop();
		assertEquals(stack.top(),1);
		stack.pop();
		assertEquals(stack.top(),0);
		stack.pop();
		assertEquals(stack.top(),-10);
		stack.pop();
		
		assertEquals(stack.getSize(),0);
		//attempting to get top from stack when it is empty
		stack.top();
		
	}
	@Test
	//Testing the list ordering when dequeuing
	void test7() {
		Stack stack = new Stack(); //create new stack.
		
		assertNull(Stack.head);
		
		//pushing 5 values into stack one by one
		stack.push(5);       
		stack.push(4);       
		stack.push(3);       
		stack.push(2);       
		stack.push(1);    
		stack.display();
		
		
		//adding some values in arrays in order
		int [] arr= {1,2,3,4,5};
		int temp,temp2;
		
		//checking values of queue corresponding to array;
		for(int i=0;i<5;i++)
		{
			temp=stack.pop();
			temp2=arr[i];
			assertEquals(temp,temp2);
		}
		
	}
	@Test
	//testing the getsize() function
	void test8() {
		Stack stack = new Stack(); //create new stack.
		
		assertEquals(stack.getSize(),0);
		//pushing 5 values into stack one by one and testing size of stack 
		stack.push(-10);       
		assertEquals(stack.getSize(),1);
		stack.push(0);       
		assertEquals(stack.getSize(),2);
		stack.push(1);       
		assertEquals(stack.getSize(),3);
		stack.push(7);       
		assertEquals(stack.getSize(),4);
		stack.push(1000);       
		assertEquals(stack.getSize(),5);
	}
}
