import java.util.Scanner;

public class prob18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");       
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();            
            for (int i = 6; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }        
        scanner.close();
    }
}
