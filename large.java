import java.io.*;
import java.util.*;

class large{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.println("Enter first number:");
int n1=c.nextInt();
System.out.println("Enter second number:");
int n2=c.nextInt();
System.out.println("Enter third number:");
int n3=c.nextInt();

if (n1>n2 && n1>n3){
System.out.print(n1+" is greater");
}
else if (n2>n1 && n2>n3){
System.out.print(n2+" is greater");
}
else{
System.out.print(n3+" is greater");
}

}}