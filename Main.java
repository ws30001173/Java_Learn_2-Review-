public class Main { // extends Threads

  // Comments
  /*
   * Multi-line comments
   * 
   * type varibleName = value;
   *
   * byte, short, int, long, float, double, char, boolean
   * 
   * Strings, Arrays, Classes, Interfaces, Enums, etc.
   * 
   * if (condition) {
   * // code
   * }
   */

  // Methods
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age + " years old.");
  }

  static int myReturnMethod(int a, int b) {
    return a + b;
  }

  public void myPublicMethod() {
    System.out.println("This is a public method.");
  }

  // Attributes
  int x = 5;
  int modelYear;
  String modelName;

  // Constructors
  public Main(int year, String name) {
    System.out.println("This is a constructor.");
    modelYear = year;
    modelName = name;
  }

  /*
   * Aceess Modifiers - controls the access level:
   * Classes: public accessible by any other class;
   * default accessible by any other class same package;
   * 
   * Attributes, Methods, and Constructors : public accessible by all class;
   * private accessible only by declared class;
   * protected accessible by same package and subclasses;
   * default accessible by same package;
   * 
   * Non-Access Modifiers - not access level but other functionality:
   * final Classes: final cannot be inherited;
   * abstract classes: abstract classes cannot be instantiated;
   * 
   * Attributes and Methods: final cannot be overridden or modified;
   * static attributes and methods belongs to class not an object of class;
   * abstract used only in abstract classes;
   * transient attributes and methods are not serialized;
   * synchronized methods are thread-safe;
   * volatile attributes and methods are not cached;
   */

  // Get, Set for private attributes
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  // Enums
  enum Level {
    LOW, MEDIUM, HIGH
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("Multiple lines`");

    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    // condition
    int time = 22;
    if (time < 12) {
      System.out.println("Good morning");
    } else if (time < 18) {
      System.out.println("Good afternoon");
    } else {
      System.out.println("Good evening");
    }
    String result = (time > 21) ? "Good night" : "Good day";
    System.out.println(result);

    /*
     * Statement 1 excuted before the code block execution
     * Statement 2 defines the condition during execution
     * Statement 3 executed after the code block execution
     * 
     */
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }

    // Arrays
    String[] Cars = { "BMW", "Audi", "Mercedes", "Ferrari" };
    System.out.println(Cars[0]);
    for (int i = 0; i < Cars.length; i++) {
      System.out.println(Cars[i]);
    }

    // Methods
    myMethod("john", 5);
    System.out.println(myReturnMethod(5, 5));

    // Objects
    Main myObj = new Main(1969, "Mustang");
    myObj.x = 25;
    System.out.println(myObj.x);
    myObj.myPublicMethod();

    System.out.println(myObj.modelYear + " " + myObj.modelName);

    myObj.setName("Max");
    System.out.println(myObj.getName());

    Level level_1 = Level.LOW;
    System.out.println(level_1);
    for (Level level : Level.values()) {
      System.out.println(level);
    }

    // Threads
    // Thread thread = new Thread();
    // thread.start();
    // System.out.println("outside of the thread!");
    // }

    // public void runThread() {
    // System.out.println("This is a thread running.");
  }
}