import java.util.Arrays;

public class Solution2_6 {
    
   
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;     
        
       
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i]; 
            maxAltitude = Math.max(maxAltitude, currentAltitude); 
        }
        
        return maxAltitude;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] gain1 = {-5, 1, 5, 0, -7};
        System.out.println("Input:  gain = " + Arrays.toString(gain1));
        int result1 = solution.largestAltitude(gain1);
        System.out.println("Output: " + result1); // Expected: 1
        System.out.println();

        
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Input:  gain = " + Arrays.toString(gain2));
        int result2 = solution.largestAltitude(gain2);
        System.out.println("Output: " + result2); // Expected: 0
    }
}
