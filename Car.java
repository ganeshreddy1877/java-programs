// Car.java
public class Car {
    // Attributes
    private String carColour;
    private String carBrand;
    private String fuelType;
    private int topSpeed;

    // Constructor
    public Car(String carColour, String carBrand, String fuelType, int topSpeed) {
        this.carColour = carColour;
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.topSpeed = topSpeed;
        System.out.println("Welcome to car garage");
    }

    // Method to start racing
    public void startRacing() {
        System.out.println(carBrand + " (" + carColour + ") is starting the race with a top speed of " + topSpeed + " km/h and runs on " + fuelType + "!");
    }

    // Method to end race
    public void endRace() {
        System.out.println(carBrand + " (" + carColour + ") has finished the race!");
    }

    // Main method to create objects and demonstrate functionality
    public static void main(String[] args) {
        // Creating three objects
        Car car1 = new Car("Red", "Ferrari", "Petrol", 200);
        Car car2 = new Car("Blue", "Tesla", "Electric", 250);
        Car car3 = new Car("Black", "BMW", "Diesel", 220);

        // Starting and ending races
        car1.startRacing();
        car1.endRace();

        car2.startRacing();
        car2.endRace();

        car3.startRacing();
        car3.endRace();
    }
}