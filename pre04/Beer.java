import java.io.*;
import java.util.*;

public class Beer{

public static void countdown(int n) {
    if (n == 99) {
        System.out.println( n, "Bottles of beer on the wall");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
