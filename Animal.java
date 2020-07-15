/**
 * Dongyuan Lu  T00587914
 */
public abstract class Animal {
  
  private String name;
  private String primaryColor;
  private int health = 3;
  private boolean isAlive = true;
  public static int count = 0;
  
  public Animal(String name, String primaryColor) {
    super();
    this.name = name;
    this.primaryColor = primaryColor;
    count += 1;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrimaryColor() {
    return primaryColor;
  }
  
  public void setPrimaryColor(String primaryColor) {
    this.primaryColor = primaryColor;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public void hit() {
    if (!isAlive()) {
      System.out.println("Animal already dead");
      return;
    }
    if (isAlive) {
      this.health = health - 1;
    }
    if (this.health == 0) {
      this.isAlive = false;
      count = count - 1;
      System.out.println(this.name + " died");
    }

  }

  public boolean isAlive() {
    return isAlive;
  }
  
  
  
}
