/*********************************************
 * Sample solution Activity 4.9.2
 *********************************************/
 public class ZooKeeperRunner
 {
   public static void main(String[] args)
   {
    // Step 5: students create the Elephant, Feline, Lion, and Tiger 
    // classes each in their own file
    
    // Step 6:     Elephant elephant = new Elephant();
    // step 14
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    // step 15
    elephant.forage();
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    
    System.out.println();
   
    // Step 8:     Tiger tiger = new Tiger();
    // step 22
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    // step 10
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    
    System.out.println();
    
    // step 24
    Tiger tiger2 = new Tiger();
    Elephant elephant2 = new Elephant();

    // step 25
    Gorilla gorilla = new Gorilla();
    
    System.out.println();
    
    // step 27
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    
    System.out.println();
    
    // step 29
    Hippo hippo = new Hippo();
    hippo.eat();
    
    System.out.println();
  
    // Its Your Turn
    Penguin penguin = new Penguin();
    penguin.fish();
    
    System.out.println();
    
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();
    
    System.out.println();
    
    Animal a1 = new Animal();
    a1.sleep();
    Object a2 = new Animal();
   // a2.sleep();    error: cannot find symbol
    
   }
 }