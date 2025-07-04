package ads.a4.aufgabe1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringTableTest {

	private static final String[] StringsToTest = {"a", "b", "one"};

	@Test
	public void testHashing() {
		// some test strings

		// creating the table object and
		// setting the capacity to 7
		StringTable table = new StringTable(7);
		// hash "a" = 97 mod 7 = 7
		assertTrue("Hashing 'a' must return 6 ", table.hash(StringsToTest[0]) == 6);
		//hash 'b' = 0
		assertTrue("Hashing 'b' must return 0 ", table.hash(StringsToTest[1]) == 0);
		//hash one = 0
		assertTrue("Hashing 'one' must return 0 ", table.hash(StringsToTest[2]) == 0);
	}

	@Test
	public void testInsertion() {
		StringTable table = new StringTable(7);

		//put the values into the table
		for (String i : StringsToTest) {
			table.put(i);
			assertTrue("table contains " + i + " must be true", table.contains(i) == true);
			table.delete(i);
			assertTrue("table contains " + i + " must be false", table.contains(i) == false);
		}
	}

	@Test
	public void testCollisions() {
		StringTable table = new StringTable(7);

		//test put
		assertTrue("Inserting 'loren' returns 0 collisions", table.put("loren") == 0);
		assertTrue("Inserting 'ipsum' returns 1 collisions because of loren", table.put("ipsum") == 1);
		assertTrue("Inserting 'ipg' returns 2 collisions because of loren and ipsum", table.put("ipg") == 2);
		//delete
		assertTrue("deleting loren", table.delete("loren") == 0);
		assertTrue("deleting ipsum", table.delete("ipsum") == 1);

		assertTrue("table contains", table.contains("unexisting") == false);
		assertTrue("deleting unexisting", table.delete("unexisting") == 0);
		assertTrue("deleting ipg", table.delete("ipg") == 2);
	}

	//when adding too many elements an exception must be thrown
	@Test(expected = Exception.class)
	public void testExceptionWhenFull() {
		StringTable table = new StringTable(5);
		for (int i = 0; i < 6; i++) {
			table.put("" + i);
		}
	}
}
