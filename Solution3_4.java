import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {
    
    // Method to find the day of the week for a given date
    public String dayOfTheWeek(int day, int month, int year) {
        // Create a LocalDate instance for the given year, month, and day
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the DayOfWeek enum and convert it to title-case text (e.g., "Sunday")
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    // Main method to run and verify test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int day1 = 31, month1 = 8, year1 = 2019;
        System.out.println("Input:  day = " + day1 + ", month = " + month1 + ", year = " + year1);
        System.out.println("Output: \"" + solution.dayOfTheWeek(day1, month1, year1) + "\""); // Expected: "Saturday"
        System.out.println();

        // Test Case 2
        int day2 = 18, month2 = 7, year2 = 1999;
        System.out.println("Input:  day = " + day2 + ", month = " + month2 + ", year = " + year2);
        System.out.println("Output: \"" + solution.dayOfTheWeek(day2, month2, year2) + "\""); // Expected: "Sunday"
        System.out.println();

        // Test Case 3
        int day3 = 15, month3 = 8, year3 = 1993;
        System.out.println("Input:  day = " + day3 + ", month = " + month3 + ", year = " + year3);
        System.out.println("Output: \"" + solution.dayOfTheWeek(day3, month3, year3) + "\""); // Expected: "Sunday"
    }
}
