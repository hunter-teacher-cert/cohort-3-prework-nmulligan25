import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args) {

int hour = 11;
int minute = 59;
int second= 59;
System.out.print("Number of minutes since midnight: ");
System.out.println(hour * 60 + minute); 
System.out.print("Number of seconds since midnight: ");
System.out.println(minute * 60 + second);          
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);
  
    }
}