import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number]; 
        
        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter the weight of person " + (i + 1) + " (in kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter the height of person " + (i + 1) + " (in cm): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);
        }

        for (int i = 0; i < number; i++) {
            double heightInMeters = personData[i][1] / 100.0; 
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters); 

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\nBMI Calculation Results:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Person", "Weight(kg)", "Height(cm)", "BMI Status");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %-3d %-10.2f %-10.2f %-15s%n", 
                              (i + 1), personData[i][0], personData[i][1], weightStatus[i]);
        }
        scanner.close(); 
    }
}