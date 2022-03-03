import java.io.*;
import java.util.*;

public class Hello {

    public static void printHello(){
        System.out.println("Hello world!");
    }

    public static String returnHello(){
        return "Hello world!";
    }

    public static void main(String[] args){
        String s;
        printHello();
        s = returnHello();
        System.out.println(s);
    }
	
}