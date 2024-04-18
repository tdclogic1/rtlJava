import java.util.Arrays;

public class Mainstrings {

    // Array of courses
    private static String[] courses = {"Physics", "Mathematics", "Biology", "Chemistry", "English"};

    public static void main(String[] args) {
        
        System.out.println("Course List: " + Arrays.toString(courses));
            
        
        sortCourses(1); // Start sorting from the second element (index 1)
        System.out.println("Sorted courses: " + Arrays.toString(courses));
    }

    public static void sortCourses(int index) {
        if (index < courses.length) {
            String key = courses[index];
            int j = index - 1;

            // Find the correct position for the key
            while (j >= 0 && courses[j].compareTo(key) > 0) {
                courses[j + 1] = courses[j];
                j--;
            }

            // Place the key in its correct position
            courses[j + 1] = key;

            // Recursively sort the remaining part of the array
            sortCourses(index + 1);
        }
    }
}