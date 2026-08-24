import java.util.Arrays;

public class Solution2_4 {
    
    
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        
        int k = 0;
        
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != nums[k]) {
                k++;             
                nums[k] = nums[i]; 
            }
        }
        
        
        return k + 1;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 2};
        System.out.println("Input:  nums = " + Arrays.toString(nums1));
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: k = " + k1);
        System.out.print("Modified Array (first k elements): [");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + (i < k1 - 1 ? ", " : ""));
        }
        System.out.println("]");
        System.out.println();

       
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Input:  nums = " + Arrays.toString(nums2));
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: k = " + k2);
        System.out.print("Modified Array (first k elements): [");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + (i < k2 - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
