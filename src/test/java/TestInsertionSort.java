import org.junit.Test;
import sorting.Insertion;

import static org.junit.Assert.assertArrayEquals;

public class TestInsertionSort {

    @Test
    public void testSmallNumbers() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Insertion.sort(new int[]{4,2,1,3}));
    }

    @Test
    public void testNegativeNumbers() {
        assertArrayEquals(new int[]{-1, 1, 2, 3}, Insertion.sort(new int[]{-1,2,1,3}));
    }

    @Test
    public void testLargeNumbers() {
        assertArrayEquals(new int[]{10000,12345,1000000}, Insertion.sort(new int[]{10000,12345,1000000}));
    }

    @Test
    public void testSameNumbers() {
        assertArrayEquals(new int[]{1,1,1,1}, Insertion.sort(new int[]{1,1,1,1}));
    }

    @Test
    public void testOneNumber() {
        assertArrayEquals(new int[]{1}, Insertion.sort(new int[]{1}));
    }
}
