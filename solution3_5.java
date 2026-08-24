import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    
    // Method to arrange numbers to form the largest number
    public String largestNumber(int[] nums) {
        // Convert the integer array into an array of Strings
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        
        // Sort the strings using a custom comparator
        // If (s2 + s1) is greater than (s1 + s2), s2 should come before s1
        Arrays.sort(asStrs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String order1 = s1 + s2;
                String order2 = s2 + s1;
                return order2.compareTo(order1); // Sorts in descending order of combination value
            }
        });
        
        // Edge Case: If the largest number after sorting is "0", the entire number is 0
        // This handles cases like [0, 0, 0] preventing outputs like "000"
        if (asStrs[0].equals("0")) {
            return "0";
        }
        
        // Build the final string from the sorted array
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumberStr.append(numAsStr);
        }
        
        return largestNumberStr.toString();
    }

    // Main method to run and verify test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {10, 2};
        System.out.println("Input:  " + Arrays.toString(nums1));
        System.out.println("Output: \"" + solution.largestNumber(nums1) + "\""); // Expected: "210"
        System.out.println();

        // Test Case 2
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Input:  " + Arrays.toString(nums2));
        System.out.println("Output: \"" + solution.largestNumber(nums2) + "\""); // Expected: "9534330"
        System.out.println();

        // Test Case 3 (Edge case with zeros)
        int[] nums3 = {0, 0, 0};
        System.out.println("Input:  " + Arrays.toString(nums3));
        System.out.println("Output: \"" + solution.largestNumber(nums3) + "\""); // Expected: "0"
    }
}
