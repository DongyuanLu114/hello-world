/**
 * Dongyuan Lu  T00587914
 */
public class Driver {
  
  
  public static void main(String[] args) { 
    
    AngryDuck angryDuck = new AngryDuck("Duck1", "Yellow");
    LoudGoose loudGoose = new LoudGoose("Goose1", "White");
    CuriousBunnny curiousBunny = new CuriousBunnny("Bunny1", "Red");
    HappyPig happyPig = new HappyPig("Pig1", "Grey");
    System.out.println("Total animal count: " + Animal.count);
    
    System.out.println("---------------Testing AngryBird-------------------------");
    System.out.println("Name of AngryDuck is " + angryDuck.getName() + " and primary color is "
                         + angryDuck.getPrimaryColor());
    System.out.println("Hitting AngryBird");
    angryDuck.hit();
    System.out.println("Hitting AngryBird");
    angryDuck.hit();
    System.out.println("Testing if AngryBird can swim");
    angryDuck.swim();
    System.out.println("Testing if AngryBird can fly");
    angryDuck.fly();
    System.out.println("The state of AngryBird is :");
    angryDuck.getState();
    angryDuck.hit();
    //displays animal already dead
    angryDuck.fly();
    
    System.out.println("Total animal count: " + Animal.count);
    
    System.out.println("---------------Testing LoudGoose-------------------------");
    System.out.println(
                       "Name of LoudGoose is " + loudGoose.getName() + " and primary color is " + loudGoose.getPrimaryColor());
    System.out.println("Hitting LoudGoose");
    loudGoose.hit();
    System.out.println("Hitting LoudGoose");
    loudGoose.hit();
    System.out.println("Testing if LoudGoose can swim");
    loudGoose.swim();
    System.out.println("The state of AngryBird is :");
    loudGoose.getState();
    System.out.println("Testing if LoudGoose can fly");
    loudGoose.fly();
    loudGoose.hit();
    //displays animal already dead
    loudGoose.fly();
   
    System.out.println("Total animal count: " + Animal.count);
   
    System.out.println("---------------Testing HappyPig-------------------------");
    System.out.println(
                       "Name of HappyPig is " + happyPig.getName() + " and primary color is " + happyPig.getPrimaryColor());
    System.out.println("Hitting HappyPig");
    happyPig.hit();
    System.out.println("Hitting HappyPig");
    happyPig.hit();
    System.out.println("Testing if HappyPig can roll");
    happyPig.roll();
    System.out.println("Testing if HappyPig can sleep");
    happyPig.sleep();
    happyPig.hit();
    //displays animal already dead
    happyPig.roll();
  
    System.out.println("Total animal count: " + Animal.count);
  
    System.out.println("---------------Testing CuriousBunny-------------------------");
    System.out.println("Name of CuriousBunny is " + curiousBunny.getName() + " and primary color is "
                         + curiousBunny.getPrimaryColor());
    System.out.println("Hitting CuriousBunny");
    curiousBunny.hit();
    System.out.println("Hitting CuriousBunny");
    curiousBunny.hit();
    System.out.println("Testing if CuriousBunny can hop");
    curiousBunny.hop();
    System.out.println("Hitting CuriousBunny");
    curiousBunny.hit();
    //displays animal already dead
    curiousBunny.hop();
  
    System.out.println("Total animal count: " + Animal.count);
    
   
  }
  
  
}
