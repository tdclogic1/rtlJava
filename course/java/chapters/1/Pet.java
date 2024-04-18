/**************************************
 * Sample solution Activity 4.9.1
 * 
 * method setName was changed
 **************************************/
public class Pet
{
  private String name;
  private int energy;
  private int happy;

  public void setName(String name)
  {
    this.name = name;
    // step 7
    System.out.println("My name is " + name); 
  }
  
  public String getName()
  {
    return name;
  }
  
  public void eat()
  {
    energy += 10;
    happy += 5;
    System.out.println("mealtime!");
  }

  public void sleep()
  {
    energy += 5;
    System.out.println("zzzzzzzzzzzzzzzzzzz");
  }
  
}
