import java.io.*;
import java.util.*;

class prime{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.print("Enter Number:");
int n1=c.nextInt();

for (int i=2;i<n1/2;i++)
{
if(n1 % i==0)
{
System.out.print("Not prime Number");
System.exit(0);
}

}
System.out.print(n1+" is prime Number");


}}