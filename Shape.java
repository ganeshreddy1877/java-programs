class Shape {
    int a, b;

    // Method to calculate area of a square
    public void calculateArea(int side) {
        int area = side * side;
        System.out.println("The area of the square is: " + area);
    }

    // Method to calculate area of a rectangle
    public void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}

class Circle extends Shape {
    int r;

    // Method to calculate area of the circle
    public void calculateArea() {
        double area = 3.14 * r * r;
        System.out.println("The area of the circle is: " + area);
    }
}
 class Main {
    public static void main(String[] args) {
        // Creating objects of each shape and calculating their areas
        Shape square = new Shape();
        square.calculateArea(4);  // Example square with side length of 4

        Shape rectangle = new Shape();
        rectangle.calculateArea(4, 5);  // Example rectangle with length 4 and width 5

        Circle circle = new Circle();
        circle.r = 3;  // Setting radius of circle to 3
        circle.calculateArea();  // Calculating area of the circle
    }
}
