package arrays;

import java.util.Arrays;

// Time Complexity: O(n) - as we have to check each item once.
// Space Complexity: O(n) - as an extra space for result array is used.
public class RunningSum {
    public static void main(String[] args){
        System.out.println("Running Sum Array: " + Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));
        System.out.println("Running Sum Array: " + Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println("Running Sum Array: " + Arrays.toString(runningSum(new int[]{3, 1, 2, 10, 1})));
        System.out.println("Running Sum Array: " + Arrays.toString(runningSum(new int[]{5})));
        System.out.println("Running Sum Array: " + Arrays.toString(runningSum(new int[]{-1, 2, -3})));
    }

    public static int[] runningSum(int[] a){
        int[] result = new int[a.length];

        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            result[i] = sum;
        }
        return result;
    }
}
