import java.util.Scanner;
class temperature{
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter the the temperature in degrees:");
        double deg=input.nextDouble();
        System.out.println("the temperatuer in fahrenheit"+((deg*9/5)+32));
    }
}