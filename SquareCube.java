package Day08;

public class SquareCube {
public static int Square(int no) {
	return no*no;
}
public static int cube(int n) {
	return n*n*n;
}
public static void main(String[] args) {
	int sq=Square(56);
	int Cube=cube(90);
	System.out.println("the Sqaure Of number "+sq);
	System.out.println("the cube Of number "+Cube);
}
}
