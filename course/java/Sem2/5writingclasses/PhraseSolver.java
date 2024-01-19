/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board game;
  private boolean solved;

  /* your code here - constructor(s) */ 
  public PhraseSolver() 
  {
    player1 = new Player();
    player2 = new Player();
    game = new Board();
    solved = false;
  }


  public void play()
  {
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      correct = true;
      while (correct)
      {
        game.setLetterValue();
        System.out.println(game.getSolvedPhrase());
        game.setLetterValue();
        System.out.println("Current Letter Value: "+ game.getLetterValue());
        
        // prompt the current player for a guess
        if (currentPlayer == 1)
        {
          System.out.println(player1.getName() + " guess: ");
        }
        else
        {
          System.out.println(player2.getName() + " guess: ");
        }
        
        // check to see if the phrase is solved
        String guess = sc.nextLine();
        solved = game.isSolved(guess);

        // check to see if the letter is in the prhase
        correct = game.guessLetter(guess);
        if (correct && !solved)
        {
          if (currentPlayer == 1)
          {
            player1.addToPoints(game.getLetterValue());
          }
          else
          {
            player2.addToPoints(game.getLetterValue());
          }
        }

      } // end of while (correct)

      // switch players if the guess is incorrect
      if (currentPlayer == 1)
      {
        currentPlayer = 2;
      }
      else
      {
        currentPlayer = 1;
      }

    } //end of while (!solved)

    /* your code here - determine how game ends */
   
    System.out.println(player1.getName() + " points:" + player1.getPoints());
    System.out.println(player2.getName() + " points:" + player2.getPoints());

  } //end of play
 
 
  }
  
}