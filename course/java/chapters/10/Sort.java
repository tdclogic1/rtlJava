import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Sort {
        private List<String> courses = new ArrayList<>(Arrays.asList("Physics", "Mathematics", "Biology", "Chemistry", "English"));

        public void sortCourses(int index) {     
            if (index < courses.size()) {
                String key = courses.get(index);
                int j = index - 1;
                while (j >= 0 && courses.get(j).compareTo(key) > 0) {
                    courses.set(j + 1, courses.get(j));
                    j = j - 1;
                }
                courses.set(j + 1, key);
                sortCourses(index + 1);
            }
        }
    }
    
