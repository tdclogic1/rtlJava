public class 35CompoundBoolean {


//Example 1: Checking if a number is positive and even


int number = 10;

if (number > 0 && number % 2 == 0) {
    System.out.println("The number is positive and even.");
} else {
    System.out.println("The number is either negative or odd.");
}

 //Example 2: Checking if a student has passed both the theory and practical exams

boolean theoryPassed = true;
boolean practicalPassed = false;

if (theoryPassed && practicalPassed) {
    System.out.println("Congratulations! You have passed both theory and practical exams.");
} else if (theoryPassed) {
    System.out.println("You have passed the theory exam, but not the practical exam.");
} else if (practicalPassed) {
    System.out.println("You have passed the practical exam, but not the theory exam.");
} else {
    System.out.println("You have not passed either the theory or practical exam.");
}

}
