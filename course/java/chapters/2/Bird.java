/*********************************************
 * Sample solution Activity 4.9.2
 * 
 * Its Your Turn
 * 
 *********************************************/
public class Bird extends Animal
{
  public Bird(String food, boolean nocturnal, double aveLifeSpan)
  { 
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A bird arrives.");
  }
  
  public Bird()
  {
    System.out.println("A bird arrives.");
  }

}