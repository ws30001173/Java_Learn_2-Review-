import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet; //every item unique
import java.util.Iterator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyClass {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter username: ");
      String username = input.nextLine();
      System.out.println("Your username is: " + username);
    }

    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateTime);
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    System.out.println("After formatting: " + myDateTime.format(myFormat));

    // ArrayList
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Bread");
    myList.add("Milk");
    myList.add("Eggs");
    System.out.println(myList);

    // HashMap
    HashMap<String, String> myMap = new HashMap<String, String>();
    myMap.put("name", "John");
    myMap.put("age", "30");
    myMap.put("city", "London");
    System.out.println(myMap); // get, remove, clear()...

    for (String key : myMap.keySet()) {
      System.out.println(key + ": " + myMap.get(key));
    }

    // HashSet
    HashSet<String> mySet = new HashSet<String>();
    mySet.add("Bread");
    mySet.add("Milk");
    mySet.add("Milk");
    System.out.println(mySet);

    // Iterator
    Iterator<String> myIterator = mySet.iterator();
    while (myIterator.hasNext()) {
      System.out.println(myIterator.next());
    }

    // Wrapper classes
    Integer myInt = 5;
    Double myDouble = 5.5;
    Boolean myBoolean = true;

    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myBoolean.booleanValue());

    // Java exceptions, throw creates custom error
    try {
      int[] myNumbers = { 1, 2, 3 };
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
      System.out.println("Exception: " + e.getMessage());
    } finally {
      System.out.println("Finally block executed.");
    }
  }
}
