// LeetCode 167: Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Approach: pointers at both ends. Array is sorted, so if the sum is too
// small move left up, if too big move right down.
// Time: O(n)  Space: O(1)

import java.util.Arrays;

public class TwoSumII{
    public static void main(String[] args){
        // Prediction: [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        // Prediction: [1, 3]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        // Prediction: [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
    }

    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target) return new int[]{left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }
}