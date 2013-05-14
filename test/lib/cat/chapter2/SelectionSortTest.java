package lib.cat.chapter2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link lib.cat.chapter2.SelectionSort#sort(java.lang.Comparable[])}.
	 */
	@Test
	public void testSort() {
		
		String[] testAarry = {"g","a","y","s","j","a"};
		Comparable[] resultArray = SelectionSort.sort(testAarry);
		
		assertEquals(true, SelectionSort.isSorted(resultArray));
	}
}
