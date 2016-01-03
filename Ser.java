package com.G.Ali;

import static org.junit.Assert.assertNotNull;
import static junit.framework.TestCase.*;
import org.junit.runners.MethodSorters;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryTest {
   public BinaryTest<Integer> B=null;
   @Before
	public void ini() {
		B=new BInaryTest<Integer>();
	}
	
            @Test
	public void SearchTest() {
		B.insert(12);
		B.insert(22);
		B.insert(32);
		B.insert(42);
		assertNotNull( B.search(12));
		assertNotNull( B.search(22));
    	        assertNotNull( B.search(32));
		assertNotNull( B.search(42));


	}
	
}