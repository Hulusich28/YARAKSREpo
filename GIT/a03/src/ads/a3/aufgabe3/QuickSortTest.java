package ads.a3.aufgabe3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import ads.a3.InputGenerator;
import ads.a3.SortTest;

class QuickSortTest extends SortTest {

	private QuickSort s;

	@BeforeEach
	void setUp() throws Exception {
		s = new QuickSort();
	}

	@RepeatedTest(10)
	void testCorrectness() {
		int[] a = InputGenerator.randomSequence(25);
		s.sort(a);
		assertTrue(isSorted(a));
	}

}
