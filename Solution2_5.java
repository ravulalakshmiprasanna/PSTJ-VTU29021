import java.util.Arrays;

public class Solution2_5 {
    
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            
            currentMax = Math.max(nums[i], currentMax + nums[i]);
           
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = solution.maxSubArray(nums1);
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output (Expected: 6): " + result1);
        System.out.println();

       
        int[] nums2 = {1};
        int result2 = solution.maxSubArray(nums2);
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output (Expected: 1): " + result2);
        System.out.println();

       
        int[] nums3 = {5, 4, -1, 7, 8};
        int result3 = solution.maxSubArray(nums3);
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output (Expected: 23): " + result3);
        System.out.println();
        
        
        int[] nums4 = {-5, -1, -3, -4};
        int result4 = solution.maxSubArray(nums4);
        System.out.println("Input: " + Arrays.toString(nums4));
        System.out.println("Output (Expected: -1): " + result4);
    }
}
