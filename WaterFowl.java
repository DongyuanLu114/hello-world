/**
 * Dongyuan Lu  T00587914
 */
public abstract class WaterFowl extends Animal {
 
  private boolean state;

  public WaterFowl(String name, String primaryColor) {
    super(name, primaryColor);
  }
  
  public void swim() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    this.state = true;
    System.out.println(super.getName() + " is swimming");
  }

  public void fly() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    this.state = false;
    System.out.println(super.getName() + " is flying");
  }

  public void getState() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    if (state)
      System.out.println(super.getName() + " is swimming");
    else
      System.out.println(super.getName() + " is flying");
  }
  
  public void setState(boolean state) {
    this.state = state;
   }
  
 
}