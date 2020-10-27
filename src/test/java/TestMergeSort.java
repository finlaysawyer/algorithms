import org.junit.Test;
import sorting.Insertion;
import sorting.Merge;

import static org.junit.Assert.assertArrayEquals;

public class TestMergeSort {

    @Test
    public void testSmallNumbers() {
        assertArrayEquals(new int[]{1, 2, 3, 4}, Merge.sort(new int[]{4,2,1,3}));
    }

    @Test
    public void testNegativeNumbers() {
        assertArrayEquals(new int[]{-1, 1, 2, 3}, Merge.sort(new int[]{-1,2,1,3}));
    }

    @Test
    public void testLargeNumbers() {
        assertArrayEquals(new int[]{10000,12345,1000000}, Merge.sort(new int[]{10000,12345,1000000}));
    }

    @Test
    public void testSameNumbers() {
        assertArrayEquals(new int[]{1,1,1,1}, Merge.sort(new int[]{1,1,1,1}));
    }

    @Test
    public void testOneNumber() {
        assertArrayEquals(new int[]{1}, Merge.sort(new int[]{1}));
    }
}
