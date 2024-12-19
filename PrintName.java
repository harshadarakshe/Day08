package Day08;

import java.util.Scanner;

public class PrintName {
public static String Name() {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter your name");
	String name=sc.next();
	 return name;
}
public static void main(String[] args) {
	System.out.println("your name is  "+Name());
}
}
