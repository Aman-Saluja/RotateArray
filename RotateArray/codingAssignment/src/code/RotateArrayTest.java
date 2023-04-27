package code;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotateArrayTest {
    
    @Test // Test for normal rotation
    public void testRotateArrayToLeft() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = 2;
        int[] expected = {3, 4, 5, 6, 7, 1, 2};
        assertArrayEquals(expected, RotateArray.rotateArrayToLeft(arr, count));
    }
    @Test //Test for negative number of rotations
    public void testRotateArrayToLeftWithNegativeCount() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = -2;
        try {
            RotateArray.rotateArrayToLeft(arr, count);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Number of rotations cannot be negative", e.getMessage());
        }
}
    @Test //Test for the case when number of rotations > size of array
    public void testRotateArrayToLeftWithLargeCount() {
    	int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = 10;
        int[] expected = {4, 5, 6, 7, 1, 2, 3};
        assertArrayEquals(expected, RotateArray.rotateArrayToLeft(arr, count));
    }
}
