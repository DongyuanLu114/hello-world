/**
 * Dongyuan Lu  T00587914
 */
public class HappyPig extends Animal{
  
  public HappyPig(String name, String primaryColor) {
    super(name, primaryColor);
  }

  public void sleep() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    System.out.println(this.getName() + " is sleeping");
  }

  public void roll() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    System.out.println(this.getName() + " is rolling");
  }
  
}
