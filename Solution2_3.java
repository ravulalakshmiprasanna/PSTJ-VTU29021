import java.util.Arrays;

public class Solution2_3 {
    
    
    public int removeElement(int[] nums, int val) {
     
        int k = 0;
        
        
        for (int i = 0; i < nums.length; i++) {
           
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
       
        return k;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        System.out.println("Input:  nums = " + Arrays.toString(nums1) + ", val = " + val1);
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Output: k = " + k1);
        System.out.print("Modified Array (first k elements): [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1 - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        System.out.println("Input:  nums = " + Arrays.toString(nums2) + ", val = " + val2);
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("Output: k = " + k2);
        System.out.print("Modified Array (first k elements): [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2 - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
