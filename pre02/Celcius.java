import java.io.*;
import java.util.*;


class Celcius 
{
    
 public static void main(String[] args)
 {
 final double F_TO_C_FACTOR = 1.8;
 double tempC;
 double tempF;
 
 Scanner in =new Scanner(System.in);

 System.out.print ("Enter the temperature in degrees Celcius...");
 tempC = in.nextDouble ();

 tempF = tempC * F_TO_C_FACTOR + 32;

 System.out.printf("%.2f C = %.2f F\n", tempC, tempF);
 
     
 }
}