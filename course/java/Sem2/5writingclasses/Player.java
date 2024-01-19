/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;
  public class Player
  {
    private String name;
    private int points;
  
    public Player()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Player Name:");
      String newName = sc.nextLine();  
      name = newName;
      System.out.println("Hello and welcome to the game, " + getName());
      points = 0;
    }
    public Player(String inputName)
    {
      name = inputName;
      System.out.println("Hello and welcome to the game, " + name);
      points = 0;
    } 
    public String getName()
    {
      return name;
    }
    public void setName(String inputName)
    {
      name = inputName;
    }
    public int getPoints()
    {
      return points;
    }
    public void addToPoints(int value)
    {
      points += value;
    }
  }