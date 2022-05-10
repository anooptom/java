import java.io.*;
import java.util.*;

class palindrome{
public static void main(String args[])
{
Scanner c= new Scanner(System.in);
System.out.print("Enter Number:");
int n1=c.nextInt();

int ch,num=0,n=n1;


while(n>0){
ch=n%10;
num=num*10+ch;
n=n/10;
}

if (num==n1)
System.out.print(num +" is palindrome");

else 
System.out.print("number is not palindrome");


}}