package lib.cat.chapter2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InsertSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSort() {
		
		String[] testAarry = {"g","a","y","s","j","a"};
		Comparable[] resultArray = SelectionSort.sort(testAarry);
		
		assertEquals(true, SelectionSort.isSorted(resultArray));
	}

}
