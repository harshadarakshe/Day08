package Day08;

import java.util.Scanner;

public class GreterNo {
 public static int Number() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the two numbers");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 if(a>b) {
		 return a;
	 }
	 else {
		 return b;
	 }
 }
 public static void main(String[] args) {
	System.out.println("greter no is"+Number());
}
}
