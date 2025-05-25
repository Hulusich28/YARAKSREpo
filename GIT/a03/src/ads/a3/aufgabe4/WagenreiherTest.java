package ads.a3.aufgabe4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class WagenreiherTest {

    Wagenreiher w;

    @BeforeEach
    void init() {
        w = new Wagenreiher();
    }     

    @Test
    public void testSortedTrain() {
        int i = w.getOptimaleAnzahl(new int[]{1, 2, 3, 4});
        assertEquals(i, 0);
    }

    @Test
    public void testUnsortedTrain() {
        int i = w.getOptimaleAnzahl(new int[]{4, 3, 2, 1});
        assertEquals(i, 6);
    }
}