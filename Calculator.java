class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two tuples (represented as arrays)
    public int add(int[] tuple1, int[] tuple2) {
        int sum = 0;
        for (int i = 0; i < tuple1.length; i++) {
            sum += tuple1[i] + tuple2[i];
        }
        return sum;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    class Main
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding two integers
        int result1 = calc.add(10, 20);
        System.out.println("Addition of two integers: " + result1);

        // Adding two tuples (arrays)
        int[] tuple1 = {1, 2};
        int[] tuple2 = {3, 4};
        int result2 = calc.add(tuple1, tuple2);
        System.out.println("Addition of two tuples: " + result2);

        // Adding three integers
        int result3 = calc.add(5, 10, 15);
        System.out.println("Addition of three integers: " + result3);
    }
}
