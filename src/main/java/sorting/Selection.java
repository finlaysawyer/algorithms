package sorting;

import java.util.Arrays;

public class Selection {
    public static int[] sort(int[] nums) {
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int min = i;

            for (int x = i + 1; x < nums.length; x++) {
                if (nums[x] < nums[min]) {
                    min = x;
                }
            }

            int smallest = nums[min];

            nums[min] = nums[i];
            nums[i] = smallest;
        }
        return nums;
    }
}
