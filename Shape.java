public class Shape {
    public double area(double a){
        return a*a;
    }
    public double area(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        double square=shape.area(a:5);
        double rectangle=shape.area(a:10,b:20);
    }
}
