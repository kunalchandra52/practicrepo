import java.util.Scanner;
public class BoolPN
{
static boolean perNum(int n)
{
System.out.println("test print");
int sum=0;
int i=1;
while(i<=n/2)
{
if(n%i==0)
sum=sum+i;
i++;
}
if(sum==n)
return true;
else
return false;
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
boolean r=perNum(n);
if(r==true)
System.out.println(r+" "+n+" is perfect number");
else
System.out.println(r+" "+n+" is perfect number");
}
}