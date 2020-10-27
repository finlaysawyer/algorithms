package sorting;

import java.util.Arrays;

public class Insertion{
    public static int[] sort(int[] nums) {
        System.out.println(Arrays.toString(nums));

        int temp;

        for (int i = 1; i < nums.length; i++) {
            for (int back = i; back > 0; back--) {
                if (nums[back] < nums[back-1]) {
                    temp = nums[back];
                    nums[back] = nums[back-1];
                    nums[back-1] = temp;
                }
            }
        }

        return nums;
    }
}
