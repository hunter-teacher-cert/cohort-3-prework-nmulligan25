import java.io.*;
import java.util.*;

import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        
double g, n; 
int number = 4;
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