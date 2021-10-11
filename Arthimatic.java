import java.util.Scanner;
class Arthimatic
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("enter the first number");
double y=s.nextDouble();
System.out.println("enter the second number");
double z=s.nextDouble();
double a=y+z;
double m=y*z;
double sub=y-z;
double d=y/z;
System.out.println("add "+a+" multiple "+m+" subtraction "+sub+" divide "+d);
}
}