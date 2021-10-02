//Please run all tests from projects when running file
//19i-0654


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class ArrayTest {

	
	@Test
	//checking if two arrays with same values and size are equal 
	void test1() {
		Array array= new Array();
		
		//initializes array object values from 0-99
		for (int i = 0; i < 100; i++) {
			Array.insert(i, i);
			}
	    //initializes array values from 0-99
		int [] array2 = IntStream.range(0, 100).toArray();
		//Returns true if array values are equal
		assertArrayEquals(Array.array,array2);
	}
	
	@Test
	//checking if two arrays with different values and same size are equal 
	void test2() {
      Array array= new Array();
      boolean equal=true;
		
		//initializes array object values from 0-99
		for (int i = 0; i < 100; i++) {
			Array.insert(i, i);
			}
	    //initializes array values from 1-100
		int [] array2 = IntStream.range(1, 101).toArray();
		for(int i=0;i<100;i++)
		{
			if(Array.array[i]==array2[i])
			{
				equal=true;
			}
			else
			{
				equal=false;
			}
		}
		//Returns true if array values are equal. In this case it should return false. 
		//The test will assertFalse
		assertFalse(equal);
	}
	
	@Test
	void test3() {
		Array array= new Array();
		
		//inserting values in random order
		array.insert(3, 0);
		array.insert(1, 1);
		array.insert(5, 2);
		array.insert(6, 3);
		array.insert(4, 4);
		array.insert(2, 5);

		//should sort the values in random order in array 
		array.bubbleSort();
		
	    //initializes array values from 1-6 in order
		int [] array2 = {1,2,3,4,5,6};
		
		for(int i=0;i<6;i++)
		{
		//Returns true if array values are equal i.e in order
		assertEquals(Array.array[i],array2[i]);
		}
	}
	
	@Test
	//Test for binary search
	void test4() {
		Array array= new Array();
		
		//inserting values in random order
		array.insert(3, 0);
		array.insert(1, 1);
		array.insert(5, 2);
		array.insert(6, 3);
		array.insert(4, 4);
		array.insert(2, 5);

		//should return true if values are found from binary search
	    assertTrue(array.binarySearch(3, 0, 5));
	    
	    //The code does not work for more than one binary search per function. Shown in next test
	    //assertTrue(array.binarySearch(3, 0, 5));
	    
	}
	@Test
	//Test for binary search
	void test41() {
		Array array= new Array();
		
		//inserting values in random order
		array.insert(3, 0);
		array.insert(1, 1);
		array.insert(5, 2);
		array.insert(6, 3);
		array.insert(4, 4);
		array.insert(2, 5);

		//should return true if values are found from binary search
	    assertTrue(array.binarySearch(3, 0, 5));
	    
	    //The code does not work for more than one binary search per function. Shown here
	    assertTrue(array.binarySearch(1, 0, 5));
	    
	}
	@Test
	//Test for binary search
	void test5() {
		Array array= new Array();
		
		//inserting values in random order
		array.insert(3, 0);
		array.insert(1, 1);
		array.insert(5, 2);
		array.insert(6, 3);
		array.insert(4, 4);
		array.insert(2, 5);


	    
    //searching for values that do not exist in the array. should assert false
	    assertFalse(array.binarySearch(10, 0, 5));
	    assertFalse(array.binarySearch(7, 0, 5));
	    assertFalse(array.binarySearch(8, 0, 5));
	    assertFalse(array.binarySearch(9, 0, 5));
	    assertFalse(array.binarySearch(-1, 0, 5));
	    assertFalse(array.binarySearch(0, 0, 5));
	}
	
	@Test
	//Test for linearsearch
	void test6() {
		Array array= new Array();
		
		//inserting values in random order
		array.insert(3, 0);
		array.insert(1, 1);
		array.insert(5, 2);
		array.insert(6, 3);
		array.insert(4, 4);
		array.insert(2, 5);

		//should return true if values are found from binary search
	    assertTrue(array.linearSearch(3));
	    assertTrue(array.linearSearch(1));
	    assertTrue(array.linearSearch(5));
	    assertTrue(array.linearSearch(6));
	    assertTrue(array.linearSearch(4));
	    assertTrue(array.linearSearch(2));
	    
	    //searching for values that do not exist. should assert false
	    assertFalse(array.linearSearch(-1));
	    assertFalse(array.linearSearch(0));
	    assertFalse(array.linearSearch(9));
	    assertFalse(array.linearSearch(8));
	    assertFalse(array.linearSearch(10));
	}
	
	
	@Test
	void test7() {
Array array= new Array();
		
		//firstly inserting some values
		array.insert(0, 0);
		array.insert(1, 1);
		array.insert(2, 2);
		array.insert(3, 3);
		
		// deleting value from array
		array.delete(3);
		//deleted array values should not be found 
		assertFalse(array.linearSearch(3));
		
		// deleting value from array
		array.delete(0);
		//deleted array values should not be found.
		assertFalse(array.linearSearch(0));
	}
	@Test
	void test8() {
		Array array= new Array();
		
		//firstly inserting some values
		array.insert(0, 0);
		array.insert(1, 1);
		array.insert(2, 2);
		array.insert(3, 3);
		
		// deleting value from array
		array.delete(3);
		//deleted array values should not be found 
		assertFalse(array.linearSearch(3));
		
		// deleting value from array
		array.delete(1);
		//deleted array values should not be found 
		assertFalse(array.linearSearch(1));
		
		array.delete(0);
		//deleted array values should not be found.
		assertFalse(array.linearSearch(0));
		
		// deleting value from array
		array.delete(2);
		//deleted array values should not be found 
		assertFalse(array.linearSearch(2));
		
		
	}

	 @Test
	 //exception testing when negative value is entered
    void test9() {
		 Array array= new Array();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
            array.insert(0, -1));
        assertEquals("Index -1 out of bounds for length 100", exception.getMessage());
    }
	 @Test
	 //exception testing when value greater than array size is entered
    void test10() {
		 Array array= new Array();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
            array.insert(0, 100));
        assertEquals("Index 100 out of bounds for length 100", exception.getMessage());
    }
    
 
}
