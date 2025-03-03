import java.util.Scanner;
class largest{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("enter value of A");
int a=input.nextInt();
System.out.println("enter value of B");
int b=input.nextInt();
System.out.println("enter value of C");
int c=input.nextInt();
int large=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println(large);
}}