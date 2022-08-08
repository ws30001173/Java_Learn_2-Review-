
// Class Inheritance
class Vehicle {
  protected String brand = "Ford";

  public void honk() {
    System.out.println("Beep!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";

  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.honk();
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

// Abstract Class
abstract class Animal {
  public abstract void makeSound();

  public void eat() {
    System.out.println("Eating...");
  }
}

class pig extends Animal {
  public void makeSound() {
    System.out.println("The pig says: wee wee");
  }

  public static void main(String[] args) {
    pig myPig = new pig();
    myPig.makeSound();
    myPig.eat();
  }
}

// Interface
interface VehicleInterface {
  public void honk();

  public void run();
}

class Tesla implements VehicleInterface {
  public void honk() {
    System.out.println("Beep!");
  }

  public void run() {
    System.out.println("Running...");
  }

  public static void main(String[] args) {
    Tesla myTesla = new Tesla();
    myTesla.honk();
    myTesla.run();
  }
}
