import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTests {
    @Test
    //Testing the constructor 
	void test0() {
		Queue queue = new Queue(10);	//initializing with size 10
		System.out.print(queue.size() + "\n");
		queue.display();//queue is empty only buffer space has been created 
		
	}
    @Test
    //Testing the constructor with negative values
	void test1() {
		Queue queue = new Queue(-1);	//initializing with size -1
		System.out.print(queue.size() + "\n");
		queue.display();//queue is empty only buffer space has been created 
		
	}
    @Test
    //Testing the display 
	void test2() throws Exception {
		Queue queue = new Queue(10);	//initializing with size 10
		System.out.print(queue.size() + "\n");
		queue.display();//queue is empty only buffer space has been created 
		
		queue.enqueue(-1);//adding a value
		queue.display();//displaying queue
		
		queue.enqueue(1);//adding a value
		queue.display();//displaying queue
		
		queue.enqueue(2);//adding a value
		queue.display();//displaying queue
		
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
	}
    @Test
    //Testing the enqueue function 
	void test3() throws Exception {
		Queue queue = new Queue(10);	//initializing with size 10
		
		//now adding 10 values to queue
		queue.enqueue(-10);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(17);
		queue.enqueue(-9);
		queue.enqueue(4);
		queue.enqueue(8);
		queue.enqueue(1);
		queue.enqueue(6);
		queue.enqueue(2);

		queue.display();//displaying queue 
		
	}
    @Test
    //Testing with more than 10 values. Test will fail
    void test4() throws Exception {
		Queue queue = new Queue(10);	//initializing with size 10
		
		//now adding 10 values to queue
		queue.enqueue(-10);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(17);
		queue.enqueue(-9);
		queue.enqueue(4);
		queue.enqueue(8);
		queue.enqueue(1);
		queue.enqueue(6);
		queue.enqueue(2);
		queue.display();//displaying queue
		
		//adding more than 10 values to the queue
		queue.enqueue(11);
		queue.enqueue(12);
		

		queue.display();//displaying queue 
		
	}   
    @Test
	//Testing the list ordering when dequeuing
	void test5() throws Exception {
    	Queue queue = new Queue(5);
		//adding some values in order
    	//to queue
    	queue.enqueue(1);
    	queue.enqueue(2);
    	queue.enqueue(3);
    	queue.enqueue(4);
    	queue.enqueue(5);
		queue.display();
		
		
		//adding some values in arrays in order
		int [] arr= {1,2,3,4,5};
		int temp,temp2;
		
		//checking values of queue corresponding to array;
		for(int i=0;i<5;i++)
		{
			temp=queue.dequeue();
			temp2=arr[i];
			assertEquals(temp,temp2);
		}
		
	}
    @Test
    //Testing the dequeue function
    void test6() throws Exception {
		Queue queue = new Queue(5);	//initializing with size 10
		
		//now adding 10 values to queue
		queue.enqueue(-10);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(17);
		queue.enqueue(-9);
		queue.display();//displaying queue 
		
		//adding more than 10 values to the queue
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue

		assertTrue(queue.empty());
		}
    @Test
    //Attempting to dequeue more values than inserted
    void test7() throws Exception {
		Queue queue = new Queue(5);	//initializing with size 10
		
		//now adding some values to queue
		queue.enqueue(-10);
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(17);
		queue.enqueue(-9);
		
		//Checking if queue is full
		assertFalse(queue.empty());
		queue.display();//displaying queue
		
		//adding more than 10 values to the queue
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		//Checking if queue is empty
		assertTrue(queue.empty());
		//now removing a sixth value that doesn't exist
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
		queue.dequeue();//deleting a value
		queue.display();//displaying queue
		
	}
    @Test
    //Attempting to enqueue more values than  array limit
    void test8() throws Exception {
    	int max=32767;
		Queue queue = new Queue(max);	//initializing with size max
		
		//now adding values to queue
		for (int i=0;i<max;i++)
		{
		queue.enqueue(i);
		}
		//Test fails because it cannot enqueue more than 32767 values
		
	}
    
    @Test
    //Testing the empty function
    void test9() throws Exception {
    	int max=32767;
		Queue queue = new Queue(5);	//initializing with size max
		
		assertTrue(queue.empty());
		//now adding values to queue
		queue.enqueue(-10);
		assertFalse(queue.empty());
		queue.enqueue(0);
		assertFalse(queue.empty());
		queue.enqueue(1);
		assertFalse(queue.empty());
		queue.enqueue(17);
		assertFalse(queue.empty());
		queue.enqueue(-9);
		assertFalse(queue.empty());
		//Test fails because it cannot enqueue more than 32767 values
		
	}
    

}
