//DEFINE A METHOD TO PRINT AREA AND PERIMETER OF RECTANGLE
import java.util.Scanner;
public class Area
{
	void PrintA(double l,double r)
	{

		double ar = l*r;
		double pri = 2*(l+r);
		System.out.println("the length"+l);
		System.out.println("the length"+r); 
		System.out.println("the area is "+ar);
		System.out.println("the perimeter is "+pri);

	}
	public static void main(String[] args)
	{
		/**
		 * hello kaise ho bhai
		 */
		Scanner s= new Scanner(System.in);
		System.out.println("main method started");
		Area a = new Area();
		System.out.println("enter the length");
		double l=s.nextDouble();
		System.out.println("enter the beradth");
		double r=s.nextDouble();
		a.PrintA(l,r);
		System.out.println("main method ended");
	}
}