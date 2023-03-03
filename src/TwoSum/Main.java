package TwoSum;

import java.util.Arrays;

public class Main extends Solution {
    public static void main(String[] args) {
        int[] num = {3, 4, 5};
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(num, tar)));
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    int[] out = {i, j};
                    return out;
                }
            }
        }
        return new int[]{};
    }
}
