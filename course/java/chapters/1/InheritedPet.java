/**************************************
 * Sample solution Activity 4.9.1
 * 
 * Refer to Pet method setName
 **************************************/
public class InheritedPet
{
  public static void main(String[] args)
  {
    System.out.println("my cat");
    Cat myCat = new Cat();
    myCat.setName("Romeo");
    myCat.purr();
    myCat.eat();
    myCat.sleep();
    
    System.out.println("my dog");
    Dog myDog = new Dog(null, 0);
    myDog.setName("Juliette");
    myDog.walk();
    myDog.eat();
    myDog.sleep();
    
    // It's Your Turn 
    // Students write either bird or rodeent subclasses,
    // for your convenience, both are included
    Canary myCanary = new Canary();
    myCanary.setName("Sunny");
    myCanary.sing();
    myCanary.sleep();
    
    Parakeet myParakeet = new Parakeet();
    myParakeet.setName("Pepe");
    myParakeet.talk();
    myParakeet.fly();
    
    Gerbil myGerbil = new Gerbil();
    myGerbil.setName("JJ");
    myGerbil.purr();
    myGerbil.sleep();
    
    GuineaPig myGP = new GuineaPig();
    myGP.setName("Goofy");
    myGP.whistle();
    myGP.nibble();
  }
}