package assignment;

import java.util.Scanner;

public class AsciiValue {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter any alphabet :");
     int ch = sc.next().charAt(0);
     
     System.out.println("ASCII value of given character :"+ch);
     sc.close();
  }
}
