import java.io.*;
import java.util.*;

public class Greeter {

public static void generationGreet(String name, int number){
  System.out.println("Good morning" +name +"the" +number);
}
public static void namedGreet(String name){
  System.out.println("Good Morning" +name);
}
  public static void greet(){
    System.out.println("Hey!");
    greet();
  }
  public static void main(String[] args){
    System.out.println("Hello World!");
    greet();
    namedGreet("Steve");
    namedGreet("Sarah");
    namedGreet("Stevie");
    generationGreet("Mike", 3);
  }
}
