import java.io.*;
import java.util.*;

class fact{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.print("Enter Number:");
int n1=c.nextInt();

int fact=1;
for(int i=1;i<=n1;i++)
{
fact=fact*i;
}
System.out.print("factorial:"+fact);


}}