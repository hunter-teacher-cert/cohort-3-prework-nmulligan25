import java.io.*;
import java.util.*;

class Guess {

  public static void main(String[] args) {
        
final double g, n; 
int number = 24;
int guess = 14;
Scanner input = new Scanner(System.in);

System.out.println("I'm thinking of a number between 1 and 100 ");
System.out.println("Can you guess what it is?");
System.out.println("Type a number:");
 g = input.nextDouble();
System.out.println("Your guess is:");
 g = input.nextDouble();
System.out.println("The number I was thinking is: 14");
System.out.println("You were off by:");
number = (g - 14);
    }
}