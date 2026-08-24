import java.time.LocalDate;

public class Solution {
    
    // Method to return the day number of the year
    public int dayOfYear(String date) {
        // Parse the YYYY-MM-DD string into a LocalDate object
        LocalDate localDate = LocalDate.parse(date);
        
        // Return the day of the year (1 to 365 or 366)
        return localDate.getDayOfYear();
    }

    // Main method to run and verify test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String date1 = "2019-01-09";
        System.out.println("Input:  date = " + date1);
        int result1 = solution.dayOfYear(date1);
        System.out.println("Output: " + result1); // Expected: 9
        System.out.println();

        // Test Case 2
        String date2 = "2019-02-10";
        System.out.println("Input:  date = " + date2);
        int result2 = solution.dayOfYear(date2);
        System.out.println("Output: " + result2); // Expected: 41
        System.out.println();

        // Test Case 3 (Leap Year Example)
        String date3 = "2012-03-01";
        System.out.println("Input:  date = " + date3);
        int result3 = solution.dayOfYear(date3);
        System.out.println("Output: " + result3); // Expected: 61 (Jan=31 + Feb=29 + Mar=1)
    }
}
