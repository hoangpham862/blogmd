package com.hquiz.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TwoSumTest {

    @Test
    public void testTwoSum_Basic() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual, "Trường hợp cơ bản: 2 + 7 = 9");
    }

    @Test
    public void testTwoSum_NegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4}; // -3 + -5 = -8
        int[] actual = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual, "Trường hợp số âm: -3 + -5 = -8");
    }

    @Test
    public void testTwoSum_MixedNumbers() {
        int[] nums = {-10, 5, 20, -5};
        int target = 15;
        int[] expected = {2, 3}; // 20 + -5 = 15
        int[] actual = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual, "Trường hợp số âm và dương: 20 + -5 = 15");
    }

    @Test
    public void testTwoSum_LargeNumbers() {
        // Constraints: -10^9 <= nums[i] <= 10^9
        int[] nums = {1000000000, 200, 500, -1000000000};
        int target = 0;
        int[] expected = {0, 3}; // 10^9 + (-10^9) = 0
        int[] actual = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual, "Trường hợp số lớn (biên): 10^9 + -10^9 = 0");
    }

    @Test
    public void testTwoSum_ElementsAtEnds() {
        int[] nums = {3, 5, 9, 12, 15, 6};
        int target = 9;
        int[] expected = {0, 5}; // 3 + 6 = 9
        int[] actual = TwoSum.twoSum(nums, target);
        assertArrayEquals(expected, actual, "Solution nằm ở đầu và cuối mảng");
    }

    @Test
    public void testTwoSum_ElementsAtMiddle() {

        int[] numsUnique = {1, 10, 20, 4, 50}; 
        int targetUnique = 5; // 1 + 4
        int[] expectedUnique = {0, 3};
        
        int[] actual = TwoSum.twoSum(numsUnique, targetUnique);
        assertArrayEquals(expectedUnique, actual, "Solution nằm ở giữa");
    }
}
