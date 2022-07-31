import java.util.Scanner;

public class MyClass {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter username: ");
      String username = input.nextLine();
      System.out.println("Your username is: " + username);
    }
  }
}
