import java.io.*;
import java.util.*;

class Beer{
   
public static void countdown(int n) {
    if (n == 0) {
        System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
     
    } else {
        System.out.println(n + " bottles of beer on the wall, "+ n +" bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        countdown(n - 1);
    }
  
  }
  public static void main(String[] args){
    countdown(99);
    
    }
}


  