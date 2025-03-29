public class Calculator {

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add two integer values
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integer values
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing the addition methods
        double sumDouble = calculator.add(5.5, 4.5);
        System.out.println("Sum of two doubles: " + sumDouble);

        int sumIntTwo = calculator.add(10, 20);
        System.out.println("Sum of two integers: " + sumIntTwo);

        int sumIntThree = calculator.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sumIntThree);
    }
}