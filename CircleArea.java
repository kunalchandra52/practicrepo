import java.util.Scanner;
class CircleArea{
	public static void main(String[] args)
	{
		Scanner ar = new Scanner(System.in);
		System.out.println("enter the radius");
		double x=ar.nextDouble();
		double arr=3.143*x*x;
		System.out.println("The area of the circle is   "+arr);
	}
}