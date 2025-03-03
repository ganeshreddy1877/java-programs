import java.util.Scanner;

class factorial{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("enter the number to find its factorial");
int n=input.nextInt();
int sum=1;
for(int i=1;i<=n;i++){
sum=sum*i;}
System.out.println(sum);}}