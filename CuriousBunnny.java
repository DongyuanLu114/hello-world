/**
 * Dongyuan Lu  T00587914
 */
public class CuriousBunnny extends Animal{
  
  public CuriousBunnny(String name, String primaryColor) {
    super(name, primaryColor);
  }

  public void hop() {
    if (!super.isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    System.out.println(this.getName() + " is hopping");
  }
    
}
