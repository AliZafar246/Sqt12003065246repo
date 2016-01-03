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
	public void deleteNodeTest() {
		B.insert(123);
		B.insert(133);
		B.insert(333);
		B.insert(173);
		assertNotNull(B.deleteNode(123));
		assertNotNull(B.deleteNode(133));
		assertNotNull(B.deleteNode(333));
		assertNotNull(B.deleteNode(173));
		
	}


	}
	
