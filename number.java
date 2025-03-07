import java.util.Scanner;

public class Random {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Do you want to start the game : please Enter 1 if not Enter 0 ");
    int n = sc.nextInt();
    double random = Math.round(100 * Math.random());
    System.out.println("random number is : " + random);
    if (n == 1) {
      System.out.println(
          "So this game based on rendom generarted number that number is already generate you have to guess the number btw 1 - 100. If you guess right you won.");
      System.out.println(
          "Note : if your number is greater or higher compare to generated number then the remebers this info to you ");
    } else if (n == 0) {
      System.out.println("thank you for watching the game");
    } else if (n > 1 || n < 0) {
      System.out.println("please choose btw 1 or 0 ");
    }

    if (n == 1) {
      System.out.println("Enter your number btw 1 to 100");
      while (true) {
        double t1 = sc.nextDouble();
        if (random == t1) {
          System.out.println("you won the game congratulation...");
          return;
        } else if (random <= t1) {
          System.out.println("your number is greater then the random number please try again");
        } else {
          System.out.println("you number is lessthen the random number please try again ");
        }
      }
    }
  }
}
