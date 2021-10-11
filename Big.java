import java.util.Scanner;
public class Big
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a= s.nextInt();
int b= s.nextInt();
int c= s.nextInt();
int big=(a>b&&a>c)?a:(b>c)?b:c;
System.out.println("Biggest number is "+big);
}
}