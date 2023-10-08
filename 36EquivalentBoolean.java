public class 36EquivalentBoolean {

    //Example with logical AND operator (&&):

    int age = 20;
    boolean isStudent = true;
    boolean isTeenager = age >= 13 && age <= 19;
    boolean isStudentTeenager = isStudent && isTeenager;
    
    System.out.println("Is the person a student teenager? " + isStudentTeenager);


    //Example with logical OR operator (||):
      boolean hasCreditCard = false;
      boolean hasPayPalAccount = true;
      boolean canMakePayment = hasCreditCard || hasPayPalAccount;
      
      System.out.println("Can the user make a payment? " + canMakePayment);  
        
//Example with logical NOT operator (!)
:

    boolean isSunny = true;
    boolean isRainy = !isSunny;
    
    System.out.println("Is it rainy? " + isRainy);
}
