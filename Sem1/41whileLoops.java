public class 41whileLoops {
  
    //examples of using a while loop in Java: Counting from 1 to 10:

int count = 1;
while (count <= 10) {
    System.out.println(count);
    count++;
}

//Printing even numbers up to a given limit:

int limit = 20;
int number = 1;
while (number <= limit) {
    if (number % 2 == 0) {
        System.out.println(number);
    }
    number++;
}

//Searching for a specific value in an array:

int[] numbers = {5, 8, 12, 3, 10};
int target = 12;
int i = 0;
boolean found = false;

while (i < numbers.length) {
    if (numbers[i] == target) {
        found = true;
        break; // exit the loop if the target is found
    }
    i++;
}

if (found) {
    System.out.println("Target found!");
} else {
    System.out.println("Target not found.");
}




}
