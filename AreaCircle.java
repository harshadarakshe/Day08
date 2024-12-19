package Day08;

import java.util.Scanner;

public class AreaCircle {
public static float Circle() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	int r=sc.nextInt();
	double pi= 3.14;
	return (float) (pi*r*r);

}

public static void main(String[] args) {
	System.out.println("Area OF circle= "+Circle());
}
}
