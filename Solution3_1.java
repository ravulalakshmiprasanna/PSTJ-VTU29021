import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    
    // Method to count the number of days between two date strings
    public int daysBetweenDates(String date1, String date2) {
        // Parse the ISO_LOCAL_DATE formatted strings (YYYY-MM-DD) into LocalDate objects
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        
        // Calculate the absolute difference in days between the two dates
        long days = ChronoUnit.DAYS.between(d1, d2);
        
        return Math.abs((int) days);
    }

    // Main method to run and verify test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String date1_1 = "2019-06-29";
        String date1_2 = "2019-06-30";
        System.out.println("Input:  date1 = " + date1_1 + ", date2 = " + date1_2);
        int result1 = solution.daysBetweenDates(date1_1, date1_2);
        System.out.println("Output: " + result1); // Expected: 1
        System.out.println();

        // Test Case 2
        String date2_1 = "2020-01-15";
        String date2_2 = "2019-12-31";
        System.out.println("Input:  date1 = " + date2_1 + ", date2 = " + date2_2);
        int result2 = solution.daysBetweenDates(date2_1, date2_2);
        System.out.println("Output: " + result2); // Expected: 15
    }
}
