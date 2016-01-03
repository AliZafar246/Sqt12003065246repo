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
	 public void Postorder()
    {
        String expected="31,51,41,61,71,81";
String output=B.printpostorder();
assertTrue(expected.equals(output));
    }
	
}