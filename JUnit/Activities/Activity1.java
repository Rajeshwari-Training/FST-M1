/**
 * 
 */
package activities;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 04108E744
 *
 */
public class Activity1 {

	static ArrayList<String> list;

	@Before
	public void setup() {
		// Initialize a new ArrayList
		list = new ArrayList<String>();

		// Add values to the list
		list.add("alpha"); // at index 0
		list.add("beta"); // at index 1
	}

	@Test
	public void insertTest() {
		assertEquals(2, list.size());
		list.add(2, "charlie");
		assertEquals(3, list.size());
		assertEquals("alpha", list.get(0));
		assertEquals("beta", list.get(1));
		assertEquals("charlie", list.get(2));
	}

	@Test
	public void replaceTest() {
		list.set(1, "charlie");
		// Assert size of list
		assertEquals(2, list.size());
		assertEquals("alpha", list.get(0));
		assertEquals("charlie", list.get(1));
	}

}
