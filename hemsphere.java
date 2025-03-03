import java.util.Scanner;
class hemsphere{
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("enter the radius of the hemisphere =");
        double radius= input.nextDouble();
        System.out.println("the area of the cicle "+(3*3.14*radius*radius*radius));
    }
}