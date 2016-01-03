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
	public void insetTest() {
		   B.insert(51);
		   B.insert(61);
                   B.insert(81);
                   B.insert(41);
                   assertNotNull( B.search(51));
	           assertNotNull( B.search(61));
	           assertNotNull( B.search(81));
	           assertNotNull( B.search(41));
		
	}


	}
	
