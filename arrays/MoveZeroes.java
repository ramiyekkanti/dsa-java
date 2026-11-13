package arrays;
import java.util.Arrays;

// Time Complexity: O(n), since both the pointers move in one direction and the right pointer visit every element in one pass.
// Space Complexity: O(1), because only a fixed number of variables is used, no matter how long the array is.
public class MoveZeroes {
    public static void main(String[] args){
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println("Array: " + Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr){
        int left = 0;
        int right = 0;

        while(right < arr.length){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }
}
