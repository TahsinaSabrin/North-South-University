package cse427;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyListTest {

	private GenericStack lstTest = new GenericStack();

    @Before
    public void init() {
        lstTest.push("Cse427");
        lstTest.push("Cse499B");
        lstTest.push("Cse435");
    }

    @Test
    public void testSize() {
        assertEquals("Checking size of List", 3, lstTest.size());
    }

    @Test
    public void testPush() {
        lstTest.push("Cse427");
        assertEquals("Adding 1 more fruit to list", 4, String.valueOf(lstTest.size()));
    }

    @Test
    public void testRemove() {
        lstTest.pop();
        assertEquals("Removing 1 fruit from list", 2, String.valueOf(lstTest.size()));
    }

    @Test
    
    public void testPopException() {
        lstTest.pop();
        assertEquals("Removing 1 fruit from list", 2, String.valueOf(lstTest.size()));
    }

    @After
    public void pop() {
    	
       lstTest.pop();
    }
}

