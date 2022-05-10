import java.io.*;
import java.util.*;

class pattern{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.print("Enter Number:");
int n1=c.nextInt();

for (int i=1;i<=n1;i++)
{
for (int j=i;j>0;j--){
System.out.print("* ");
}
System.out.println("");
}


}}