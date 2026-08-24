import java.util.Arrays;

public class Solution2_1 {
    
    public int[] runningSum(int[] nums) {
      
        for (int i = 1; i < nums.length; i++) {
            
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Input:  " + Arrays.toString(nums1));
        int[] result1 = solution.runningSum(nums1);
        System.out.println("Output: " + Arrays.toString(result1)); // Expected: [1, 3, 6, 10]
        System.out.println();

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("Input:  " + Arrays.toString(nums2));
        int[] result2 = solution.runningSum(nums2);
        System.out.println("Output: " + Arrays.toString(result2)); // Expected: [1, 2, 3, 4, 5]
        System.out.println();

        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println("Input:  " + Arrays.toString(nums3));
        int[] result3 = solution.runningSum(nums3);
        System.out.println("Output: " + Arrays.toString(result3)); // Expected: [3, 4, 6, 16, 17]
    }
}
