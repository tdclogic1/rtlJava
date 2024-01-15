public class 37ComparingObjects {

//Example 1: Comparing strings using equals() method

String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

System.out.println(str1.equals(str2)); // true
System.out.println(str1.equals(str3)); // true

//Example 2: Comparing integers using == operator

Integer num1 = 10;
Integer num2 = 10;
Integer num3 = new Integer(10);

System.out.println(num1 == num2); // true
System.out.println(num2 == num3); // 
System.out.println(num1 == num3); // 

    
}
