public class 34IfElseIfExample {
    public static void main(String[] args) {


//Example 1: Checking the grade based on score

int score = 85;

if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else if (score >= 60) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}

//Example 2: Determining the time of day based on hour

int hour = 14;

if (hour < 12) {
    System.out.println("Good morning!");
} else if (hour >= 12 && hour < 18) {
    System.out.println("Good afternoon!");
} else {
    System.out.println("Good evening!");
}

//Example 3: Checking the eligibility for voting based on age

int age = 17;

if (age >= 18) {
    System.out.println("You are eligible to vote!");
} else {
    System.out.println("Sorry, you are not eligible to vote yet.");
}

    }