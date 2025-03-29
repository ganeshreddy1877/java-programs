import java.util.Scanner;

public class College {
    // This method will be overridden by the subclasses
    public void Eligibility() {
        System.out.println("The candidate is a fluke");
    }
}

class UG extends College {
    String name;
    int qualification;
    int percentage;

    // Constructor to initialize UG student details
    UG(String name, int qualification, int percentage) {
        this.name = name;
        this.qualification = qualification;
        this.percentage = percentage;
        System.out.println("Name: " + name + ", Qualification: " + qualification + ", Percentage: " + percentage);
    }

    // Overriding the Eligibility method for UG
    @Override
    public void Eligibility() {
        System.out.println("The candidate is eligible for UG");
    }
}

class PG extends College {
    String name;
    int qualification;
    int percentage;

    // Constructor to initialize PG student details
    PG(String name, int qualification, int percentage) {
        this.name = name;
        this.qualification = qualification;
        this.percentage = percentage;
        System.out.println("Name: " + name + ", Qualification: " + qualification + ", Percentage: " + percentage);
    }

    // Overriding the Eligibility method for PG
    @Override
    public void Eligibility() {
        System.out.println("The candidate is eligible for PG");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your qualification (e.g., 12 for high school, 10 for 10th, etc.):");
        int qualification = scanner.nextInt();

        System.out.println("Enter your percentage:");
        int percentage = scanner.nextInt();

        // Logic to check eligibility
        if (percentage >= 70) {
            PG p1 = new PG(name, qualification, percentage);
            p1.Eligibility();
        } else if (percentage >= 60) {
            UG u1 = new UG(name, qualification, percentage);
            u1.Eligibility();
        } else {
            College c1 = new College();  // Call the parent class method
            c1.Eligibility();
        }
    }
}
