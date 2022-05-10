import java.io.*;
import java.util.*;

class fib{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.print("Enter Number:");
int n1=c.nextInt();

int f=0,f1=1,t;

for(int i=0;i<n1;i++)
{
t=f;
f=f+f1;
f1=t;
}

System.out.print(n1+"th fibinocci number:"+ f);

}}